package se.gu.evaluation.rq;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import se.gu.evaluation.rq.environment.Environment;
import se.gu.evaluation.rq.environment.RandomEnvironmentGenerator;

public class RQ2RandomEnvironmentGenerator {

	public static void main(String[] args)
			throws InterruptedException, IOException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		int numOfBuildings = 6;
		final int numberOfConditions = 4;

		final int numberOfLocations = 10;

		int matrixSize = 4;

		for (int buildingConfig = 0; buildingConfig < numOfBuildings; buildingConfig++) {

			RandomEnvironmentGenerator gen = new RandomEnvironmentGenerator(numberOfLocations, matrixSize,
					numberOfConditions);

			Environment env = gen.getEnvironment();
			
			PrintStream writer = new PrintStream(new File("environmentCTL"+buildingConfig+".txt"));
			env.printMatrix(writer);
			writer.close();
			
			
			
		}
		System.out.println("END - environments generated");

	}

}
