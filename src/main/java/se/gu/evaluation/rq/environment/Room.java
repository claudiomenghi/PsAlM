package se.gu.evaluation.rq.environment;

import java.awt.Color;

import simbad.sim.AbstractWall;
import simbad.sim.EnvironmentDescription;
import simbad.sim.HorizontalWall;
import simbad.sim.VerticalWall;

public class Room {

	private int x;
	private int y;
	private boolean northWall;
	private boolean southWall;
	private boolean eastWall;
	private boolean westWall;

	private final static Color c = Color.GRAY;

	public static final float ROOM_LENGHT = 3f;

	public Room(String name, int x, int y, boolean northWall, boolean southWall, boolean eastWall, boolean westWall,
			EnvironmentDescription e,float originx, float originy) {
		this.x = x;
		this.y = y;
		this.northWall = northWall;
		this.southWall = southWall;
		this.eastWall = eastWall;
		this.westWall = westWall;



		if (northWall) {
			AbstractWall north = new HorizontalWall((float) this.x * ROOM_LENGHT+originx, (float) this.y * ROOM_LENGHT+originy,
					(float) (this.y + 1) * ROOM_LENGHT+originy, e, c);
		} else {
			AbstractWall north1 = new HorizontalWall((float) (this.x) * ROOM_LENGHT+originx,
					(float) this.y * ROOM_LENGHT + (float) 4.0 / 5 * ROOM_LENGHT+originy, (float) (this.y + 1) * ROOM_LENGHT+originy, e,
					c);

			AbstractWall north2 = new HorizontalWall((float) (this.x) * ROOM_LENGHT+originx, (float) this.y * ROOM_LENGHT+originy,
					(float) (this.y) * ROOM_LENGHT + ROOM_LENGHT * 1 / 5+originy, e, c);
		}

		if (southWall) {
			AbstractWall south = new HorizontalWall((float) (this.x + 1) * ROOM_LENGHT+originx, (float) this.y * ROOM_LENGHT+originy,
					(float) (this.y + 1) * ROOM_LENGHT+originy, e, c);
		} else {
			AbstractWall south1 = new HorizontalWall((float) (this.x + 1) * ROOM_LENGHT+originx, (float) this.y * ROOM_LENGHT+originy,
					(this.y) * ROOM_LENGHT + ROOM_LENGHT / 5+originy, e, c);
			AbstractWall south2 = new HorizontalWall((float) (this.x + 1) * ROOM_LENGHT+originx,
					(this.y + 1) * ROOM_LENGHT - ROOM_LENGHT * 1 / 5+originy, (float) (this.y + 1) * ROOM_LENGHT+originy, e, c);

		}
		
		

		if (eastWall) {
			AbstractWall east = new VerticalWall((float) this.y * ROOM_LENGHT+originy, (float) this.x * ROOM_LENGHT+originx,
					(float) (this.x + 1) * ROOM_LENGHT+originx, e, c);
		} else {

			AbstractWall east1 = new VerticalWall((float) (this.y + 1) * ROOM_LENGHT+originy,
					(float) this.x * ROOM_LENGHT + (float) 4.0 / 5 * ROOM_LENGHT+originx, (float) (this.x + 1) * ROOM_LENGHT+originx, e,
					c);

			AbstractWall east2 = new VerticalWall((float) (this.y + 1) * ROOM_LENGHT+originy, (float) this.x * ROOM_LENGHT+originx,
					(float) (this.x) * ROOM_LENGHT + ROOM_LENGHT * 1 / 5+originx, e, c);

		}

		if (westWall) {
			AbstractWall weast = new VerticalWall((float) (this.y + 1) * ROOM_LENGHT+originy, (float) this.x * ROOM_LENGHT+originx,
					(float) (this.x + 1) * ROOM_LENGHT+originx, e, c);
		} else {

			AbstractWall weast1 = new VerticalWall((float) (this.y + 1) * ROOM_LENGHT+originy, (float) this.x * ROOM_LENGHT+originx,
					(this.x) * ROOM_LENGHT + ROOM_LENGHT / 5+originx, e, c);

			AbstractWall weast2 = new VerticalWall((float) (this.y + 1) * ROOM_LENGHT+originy,
					(this.x + 1) * ROOM_LENGHT - ROOM_LENGHT * 1 / 5+originx, (float) (this.x + 1) * ROOM_LENGHT+originx, e, c);

		}

	}

}
