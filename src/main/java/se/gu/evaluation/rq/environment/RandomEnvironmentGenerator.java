package se.gu.evaluation.rq.environment;

import java.util.concurrent.ThreadLocalRandom;

public class RandomEnvironmentGenerator {

	private Environment env;

	private String planeArray[][];
	
	private String conditionArray[][];
	
	private String actionArray[][];
	
	private int numberOfLocations;
	private int matrixsize;

	public RandomEnvironmentGenerator(int numberOfLocations, int numberOfConditions, int matrixsize) {

		this.numberOfLocations=numberOfLocations;
		this.matrixsize=matrixsize;
		planeArray = new String[matrixsize][matrixsize];
		conditionArray = new String[matrixsize][matrixsize];
		actionArray = new String[matrixsize][matrixsize];

		
		for (int num = 0; num < numberOfLocations; num++) {

			int connNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
			int rowNum = ThreadLocalRandom.current().nextInt(0, matrixsize);

			while (planeArray[connNum][rowNum]!=null) {
				connNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
				rowNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
			}
			planeArray[connNum][rowNum] = "l"+num;
		}
		
		
		for (int num = 0; num < numberOfConditions; num++) {

			int connNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
			int rowNum = ThreadLocalRandom.current().nextInt(0, matrixsize);

			while (planeArray[connNum][rowNum]==null || conditionArray[connNum][rowNum]!=null) {
				connNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
				rowNum = ThreadLocalRandom.current().nextInt(0, matrixsize);
			}
			conditionArray[connNum][rowNum] = "cond";
		}

	}
	
	public Environment getEnvironment() {
		
		
		

		this.env = new Environment(planeArray, numberOfLocations, this.conditionArray,this.actionArray);
		return this.env;
	}
}
