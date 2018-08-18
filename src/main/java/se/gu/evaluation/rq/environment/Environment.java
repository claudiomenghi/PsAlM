package se.gu.evaluation.rq.environment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import project.Point;
import se.gu.ltl.LTLNeg;
import se.gu.ltl.atoms.PLAtom;
import se.gu.ltl.visitors.LTLFormulaToStringVisitor;
import se.gu.patterns.coremovement.coverage.Visit;
import se.gu.patterns.visitor.Pattern2LTL;

import java.util.Set;

import simbad.sim.EnvironmentDescription;

public class Environment {

	/**
	 * @return the locations
	 */
	public Set<String> getLocations() {
		return locations;
	}

	private Set<String> locations;

	private Map<String, Set<String>> connections;

	private final String planeArray[][];

	private final String conditionArray[][];

	private final String actionArray[][];

	private Map<String, String> conditionMap;

	private Map<String, String> actionMap;

	private final RobotAvatar robot1;

	private String nonAdjacentSource;
	private String nonAdjacentDestination;
	
	private final float originx;
	
	
	public int getMatrixSize() {
		return planeArray.length;
	}
	
	private Point position;
	/**
	 * @return the originx
	 */
	public float getOriginx() {
		return originx;
	}

	/**
	 * @return the originy
	 */
	public float getOriginy() {
		return originy;
	}

	private final float originy;

	public static Environment loadEnvironmentDirections(String filePath) throws Exception {

		Set<String> loca = new HashSet<>();
		File f = new File(filePath);

		String planeArray[][] = null;
		int numerOfLocations = 0;
		String conditionArray[][] = null;

		String actionArray[][] = null;

		boolean first = true;
		int row = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {

			String line;
			while ((line = br.readLine()) != null) {
				if (first) {

					numerOfLocations = ((int) line.chars().filter(num -> num == ';').count());
					planeArray = new String[numerOfLocations][numerOfLocations];
					conditionArray = new String[numerOfLocations][numerOfLocations];
					actionArray = new String[numerOfLocations][numerOfLocations];
					first = false;
				}

				line = line.replaceAll(" ", "");
				line = line.replaceAll("\t", "");

				String[] cells = line.split(";");

				for (int i = 0; i < cells.length; i++) {
					if (cells[i].contains(",")) {
						String[] locations = cells[i].split(",");

						if (!locations[0].equals("---")) {
							planeArray[row][i] = locations[0];
							loca.add(locations[0]);
						}
						if (!locations[1].equals("---")) {
							conditionArray[row][i] = locations[1];
						}
						if (!locations[2].equals("---")) {
							actionArray[row][i] = locations[2];
						}

					} else {
						if (!cells[i].equals("---")) {
							planeArray[row][i] = cells[i];
							loca.add(cells[i]);
						}
					}
				}

				row++;
			}

		}

		return new Environment(planeArray, loca.size(), conditionArray, actionArray, true);

	}

	public static Environment loadEnvironmentNoDirections(String filePath) throws Exception {

		Set<String> loca = new HashSet<>();

		System.out.println("Loading environment from file: " + filePath);
		File f = new File(filePath);

		String planeArray[][] = null;
		int numerOfLocations = 0;
		String conditionArray[][] = null;

		String actionArray[][] = null;

		boolean first = true;
		int row = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {

			String line;
			while ((line = br.readLine()) != null) {
				if (first) {

					numerOfLocations = ((int) line.chars().filter(num -> num == ';').count());
					planeArray = new String[numerOfLocations][numerOfLocations];
					conditionArray = new String[numerOfLocations][numerOfLocations];
					actionArray = new String[numerOfLocations][numerOfLocations];
					first = false;
				}

				line = line.replaceAll(" ", "");
				line = line.replaceAll("\t", "");

				String[] cells = line.split(";");

				for (int i = 0; i < cells.length; i++) {
					if (cells[i].contains(",")) {
						String[] locations = cells[i].split(",");

						if (!locations[0].equals("---")) {
							planeArray[row][i] = locations[0];
							loca.add(locations[0]);
						}
						if (!locations[1].equals("---")) {
							conditionArray[row][i] = locations[1];
						}
						if (!locations[2].equals("---")) {
							actionArray[row][i] = locations[2];
						}

					} else {
						if (!cells[i].equals("---")) {
							planeArray[row][i] = cells[i];
							loca.add(cells[i]);
						}
					}
				}

				row++;
			}

		}
		return new Environment(planeArray, loca.size(), conditionArray, actionArray);

	}

	/*
	 * public static Environment loadEnvironment(String filePath) throws Exception {
	 * 
	 * Set<String> loca = new HashSet<>(); File f = new File(filePath);
	 * 
	 * String planeArray[][] = null; int numerOfLocations = 0; String
	 * conditionArray[][] = null;
	 * 
	 * String actionArray[][] = null;
	 * 
	 * boolean first = true; int row = 0; try (BufferedReader br = new
	 * BufferedReader(new FileReader(f))) {
	 * 
	 * String line; while ((line = br.readLine()) != null) { if (first) {
	 * 
	 * numerOfLocations = ((int) line.chars().filter(num -> num == ';').count());
	 * planeArray = new String[numerOfLocations][numerOfLocations]; conditionArray =
	 * new String[numerOfLocations][numerOfLocations]; first = false; }
	 * 
	 * line = line.replaceAll(" ", ""); line = line.replaceAll("\t", "");
	 * 
	 * String[] cells = line.split(";");
	 * 
	 * for (int i = 0; i < cells.length; i++) { if (cells[i].contains(",")) {
	 * String[] locations = cells[i].split(","); planeArray[row][i] = locations[0];
	 * loca.add(locations[0]); conditionArray[row][i] = locations[1];
	 * 
	 * } else { if (!cells[i].equals("---")) { planeArray[row][i] = cells[i];
	 * loca.add(cells[i]); } } }
	 * 
	 * row++; }
	 * 
	 * 
	 * }
	 * 
	 * return new Environment(planeArray, loca.size(), conditionArray,actionArray);
	 * 
	 * }
	 */

	public Environment(String planeArray[][], int numberOfLocations, String conditionArray[][], String actionArray[][],
			boolean a) {
		this.locations = new HashSet<>();
		this.connections = new HashMap<>();
		this.planeArray = planeArray;
		this.conditionArray = conditionArray;
		this.conditionMap = new HashMap<>();
		this.actionMap = new HashMap<>();

		this.actionArray = actionArray;
		int matrixsize = planeArray.length;

		for (int num = 0; num < numberOfLocations; num++) {
			this.addLocation("l" + num);
		}

		if (matrixsize % 2 == 0) {
			originx = -matrixsize / 2 * Room.ROOM_LENGHT;
			originy = -matrixsize / 2 * Room.ROOM_LENGHT;
		} else {
			originx = -matrixsize / 2 * Room.ROOM_LENGHT - Room.ROOM_LENGHT / 2;
			originy = -matrixsize / 2 * Room.ROOM_LENGHT - Room.ROOM_LENGHT / 2;
		}

		 position = null;
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {

				if (planeArray[i][j] != null && planeArray[i][j].equals("l0")) {
					position = new Point(Room.ROOM_LENGHT * i + Room.ROOM_LENGHT / 2 + originx,
							Room.ROOM_LENGHT * j + Room.ROOM_LENGHT / 2 + originy);
				}
				if (i < matrixsize - 1) {
					this.addDirectedConnection(planeArray[i][j], planeArray[i + 1][j]);
				}
				if (j < matrixsize - 1) {
					this.addDirectedConnection(planeArray[i][j], planeArray[i][j + 1]);
				}
			}
		}

		int initx = -1;
		int inity = -1;
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (initx == -1 && inity == -1 && planeArray[i][j] != null) {
					initx = i;
					inity = j;
				}
			}
		}

		int endx = -1;
		int endy = -1;

		for (int i = matrixsize - 1; i >= 0; i--) {
			for (int j = matrixsize - 1; j >= 0; j--) {
				if (endx == -1 && endy == -1 && planeArray[i][j] != null) {
					endx = i;
					endy = j;
				}
			}
		}
		this.nonAdjacentSource=planeArray[endx][endy];
		this.nonAdjacentDestination=planeArray[initx][inity];
		this.addDirectedConnection(planeArray[endx][endy], planeArray[initx][inity]);

		robot1 = new RobotAvatar(position, "Robot 1");

		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (conditionArray[i][j] != null) {
					this.conditionMap.put(planeArray[i][j], conditionArray[i][j]);
				}
			}
		}

		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (actionArray[i][j] != null) {
					this.actionMap.put(planeArray[i][j], conditionArray[i][j]);
				}
			}
		}

	}

	public Environment(String planeArray[][], int numberOfLocations, String conditionArray[][],
			String actionArray[][]) {
		this.locations = new HashSet<>();
		this.connections = new HashMap<>();
		this.planeArray = planeArray;

		this.conditionArray = conditionArray;
		this.conditionMap = new HashMap<>();
		this.actionArray = actionArray;
		this.actionMap = new HashMap<>();

		int matrixsize = planeArray.length;

		for (int num = 0; num < numberOfLocations; num++) {
			this.addLocation("l" + num);
		}

		if (matrixsize % 2 == 0) {
			originx = -matrixsize / 2 * Room.ROOM_LENGHT;
			originy = -matrixsize / 2 * Room.ROOM_LENGHT;
		} else {
			originx = -matrixsize / 2 * Room.ROOM_LENGHT - Room.ROOM_LENGHT / 2;
			originy = -matrixsize / 2 * Room.ROOM_LENGHT - Room.ROOM_LENGHT / 2;
		}

		 position = null;
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {

				if (planeArray[i][j] != null && planeArray[i][j].equals("l0")) {
					position = new Point(Room.ROOM_LENGHT * i + Room.ROOM_LENGHT / 2 + originx,
							Room.ROOM_LENGHT * j + Room.ROOM_LENGHT / 2 + originy);
				}
				if (i > 0) {
					this.addConnections(planeArray[i][j], planeArray[i - 1][j]);
					this.addConnections(planeArray[i - 1][j], planeArray[i][j]);
				}
				if (j > 0) {
					this.addConnections(planeArray[i][j - 1], planeArray[i][j]);
					this.addConnections(planeArray[i][j], planeArray[i][j - 1]);
				}
				if (i < matrixsize - 1) {
					this.addConnections(planeArray[i][j], planeArray[i + 1][j]);
					this.addConnections(planeArray[i + 1][j], planeArray[i][j]);
				}
				if (j < matrixsize - 1) {
					this.addConnections(planeArray[i][j], planeArray[i][j + 1]);
					this.addConnections(planeArray[i][j + 1], planeArray[i][j]);
				}
			}
		}

		robot1 = new RobotAvatar(position, "Robot 1");

		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (conditionArray[i][j] != null) {
					this.conditionMap.put(planeArray[i][j], conditionArray[i][j]);
				}
			}
		}
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (actionArray[i][j] != null) {
					this.actionMap.put(planeArray[i][j], conditionArray[i][j]);
				}
			}
		}

	}

	public int[] getMatrixPosition(String location) {
		
		int matrixsize = planeArray.length;

		boolean found=false;
		int[] p=new int[2];
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (planeArray[i][j] != null && planeArray[i][j].equals(location)) {
					p[0]=i;
					p[1]=j;
					 found=true;
				}
			}
		}
		if(!found) {
			throw new IllegalArgumentException("Location "+location+"not found");
		}
		return p;
	}

	public Point getPosition(String location) {
		int matrixsize = planeArray.length;

		Point position = null;
		for (int i = 0; i < matrixsize; i++) {
			for (int j = 0; j < matrixsize; j++) {
				if (planeArray[i][j] != null && planeArray[i][j].equals(location)) {
					position = new Point(Room.ROOM_LENGHT * i + Room.ROOM_LENGHT / 2 + originx,
							Room.ROOM_LENGHT * j + Room.ROOM_LENGHT / 2 + originy);
				}
			}
		}
		return position;
	}
	
	public boolean isConnected(String location, String location2) {
		return !(location.equals(nonAdjacentSource) && location2.equals(nonAdjacentDestination));
	}

	public void addLocation(String location) {
		this.locations.add(location);
	}

	public void addDirectedConnection(String source, String destination) {
		if (source != null && destination != null) {
			if (!connections.containsKey(source)) {
				connections.put(source, new HashSet<>());
			}
			this.connections.get(source).add(destination);
		}
	}

	public void addConnections(String source, String destination) {
		if (source != null && destination != null) {
			if (!connections.containsKey(source)) {
				connections.put(source, new HashSet<>());
			}
			if (!connections.containsKey(destination)) {
				connections.put(destination, new HashSet<>());
			}

			this.connections.get(source).add(destination);
			this.connections.get(destination).add(source);
		}
	}

	public Map<String, Set<String>> getConnections() {
		return this.connections;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();

		for (Entry<String, Set<String>> e : connections.entrySet()) {
			b.append(e.getKey() + "\t -> \t ");
			for (String s : e.getValue()) {
				b.append(s + "\t");
			}
			b.append("\n");
		}

		return b.toString();
	}

	/**
	 * @return the planeArray
	 */
	public String[][] getPlaneArray() {
		return planeArray;
	}

	public void draw(EnvironmentDescription e) {

		for (int i = 0; i < planeArray.length; i++) {

			for (int j = 0; j < planeArray.length; j++) {
				if (planeArray[i][j] != null) {

					boolean east = (j == 0) ? true : planeArray[i][j - 1] == null;
					boolean weast = (j == planeArray.length - 1) ? true : planeArray[i][j + 1] == null;

					boolean north = (i == 0) ? true : planeArray[i - 1][j] == null;
					boolean south = (i == planeArray.length - 1) ? true : planeArray[i + 1][j] == null;

					new Room(planeArray[i][j], i, j, north, south, east, weast, e, originx, originy);
				}

			}
		}
		for (int i = 0; i < conditionArray.length; i++) {

			for (int j = 0; j < conditionArray.length; j++) {
				if (conditionArray[i][j] != null) {

					new Obstacle(i, j, e, originx, originy);
				}
			}
		}

	}

	/*
	 * public String toNuSMV() {
	 * 
	 * StringBuilder b = new StringBuilder();
	 * 
	 * b.append("MODULE main\n");
	 * 
	 * b.append("VAR\n"); b.append("state : { "); boolean first = true; for (String
	 * location : locations) { if (first) { b.append(location); first = false; }
	 * else { b.append(", " + location); } } b.append("};\n");
	 * b.append("cond : boolean;\n"); b.append("act : boolean;\n");
	 * 
	 * b.append("ASSIGN\n");
	 * 
	 * if (conditionMap.containsKey("l0")) { b.append("  init(cond) := TRUE; \n"); }
	 * else { b.append("  init(cond) := FALSE; \n"); }
	 * b.append("  init(state) := l0; \n"); b.append("  next(state) := case \n ");
	 * 
	 * for (String location : locations) {
	 * 
	 * boolean firststate = true; b.append("state = " + location + " : ");
	 * b.append(" { ");
	 * 
	 * if (!connections.containsKey(location)) { b.append(location); firststate =
	 * false; }
	 * 
	 * if (connections.containsKey(location)) {
	 * 
	 * for (String loc : connections.get(location)) {
	 * 
	 * if (firststate) { b.append(loc); firststate = false; } else { b.append("," +
	 * loc); }
	 * 
	 * } } b.append(" } ; \n"); }
	 * 
	 * b.append("  esac;\n ");
	 * 
	 * b.append("  next(cond) := case \n "); for (String location : locations) {
	 * 
	 * b.append("next(state = " + location + "): "); b.append(" ");
	 * 
	 * if (conditionMap.containsKey(location)) { b.append(" TRUE ; \n"); } else {
	 * b.append(" FALSE ; \n"); } }
	 * 
	 * b.append("  esac;\n ");
	 * 
	 * return b.toString(); }
	 */

	public String toNuSMVCTL() {

		StringBuilder b = new StringBuilder();

		b.append("MODULE main\n");

		b.append("VAR\n");
		b.append("state : { ");
		boolean first = true;
		for (String location : locations) {
			if (first) {
				b.append(location);
				first = false;
			} else {
				b.append(", " + location);
			}
		}
		b.append("};\n");
		b.append("cond : boolean;\n");
		b.append("act : boolean;\n");

		b.append("ASSIGN\n");

		if (conditionMap.containsKey("l0")) {
			b.append("  init(cond) := TRUE; \n");
		} else {
			b.append("  init(cond) := FALSE; \n");
		}
		b.append("  init(state) := l0; \n");
		b.append("  init(act) := FALSE; \n");
		b.append("  next(state) := case \n ");

		for (String location : locations) {

			boolean firststate = true;
			b.append("state = " + location + " : ");
			b.append(" { ");

			if (!connections.containsKey(location)) {
				b.append(location);
				firststate = false;
			} else {

				for (String loc : connections.get(location)) {

					if (firststate) {
						b.append(loc);
						firststate = false;
					} else {
						b.append("," + loc);
					}

				}
			}
			b.append(" } ; \n");
		}

		b.append("  esac;\n ");

		b.append("  next(cond) := case \n ");
		for (String location : locations) {

			b.append("next(state = " + location + "): ");
			b.append(" ");

			if (conditionMap.containsKey(location)) {
				b.append(" TRUE ; \n");
			} else {
				b.append(" FALSE ; \n");
			}

		}
		b.append("  esac;\n ");

		b.append("  next(act) := case \n ");

		for (String location : locations) {

			b.append("next(state = " + location + "): ");
			b.append(" ");

			if (actionMap.containsKey(location)) {
				b.append(" TRUE ; \n");
			} else {
				b.append(" FALSE ; \n");
			}

		}

		b.append("  esac;\n ");

		return b.toString();
	}

	public void printMatrix(PrintStream w) throws IOException {
		int matrixsize = planeArray.length;
		for (int i = 0; i < matrixsize; i++) {

			String row = "";
			for (int j = matrixsize - 1; j >= 0; j--) {
				row = row + "\t" + (planeArray[i][j] == null ? "---" : planeArray[i][j])
						+ (conditionArray[i][j] != null ? "," + conditionArray[i][j] + ";" : ";");
			}
			w.println(row);
		}

	}
	
	public void printSimbadMatrix(PrintStream w) throws IOException {
		int matrixsize = planeArray.length;
		for (int i = 0; i < matrixsize; i++) {

			String row = "";
			for (int j = 0; j< matrixsize; j++) {
				row = row + "\t" + (planeArray[j][i] == null ? "--" : planeArray[j][i])
						+ (conditionArray[j][i] != null ? "," + conditionArray[j][i] + ";" : ",----;")
						+ (actionArray[j][i] != null ? "," + actionArray[j][i] + ";" : ",---;");
			}
			w.println(row);
		}

	}

	/**
	 * @return the robot1
	 */
	public RobotAvatar getRobot1() {
		return robot1;
	}

}
