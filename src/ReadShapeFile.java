/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import java.awt.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {
	
	//TODO:  You will likely need to write four methods here.  One method to construct each shape
	//given the Scanner passed as a parameter.  I would suggest four static methods in this case.

	/**
	 * Construct a new circle object from a scanner input
	 * @param in the scanner of the file
	 * @return newly constructed circle
	 */
	private static Circle constructCircle(Scanner in) {
		// position and velocity
		int px = in.nextInt();
		int py = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		// should be filled
		boolean filled = in.nextBoolean();
		// diameter
		int diameter = in.nextInt();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		// insertion time
		int insertionTime = in.nextInt();

		Color clr = new Color(r, g, b);

		return new Circle(insertionTime, px, py, vx, vy, diameter, clr, filled);
	}

	/**
	 * Construct a new oval object from a scanner input
	 * @param in the scanner of the file
	 * @return newly constructed oval
	 */
	private static Oval constructOval(Scanner in) {
		// position and velocity
		int px = in.nextInt();
		int py = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		// should be filled
		boolean filled = in.nextBoolean();
		// width and height
		int width = in.nextInt();
		int height = in.nextInt();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		// insertion time
		int insertionTime = in.nextInt();

		Color clr = new Color(r, g, b);

		return new Oval(insertionTime, px, py, vx, vy, width, height, clr, filled);
	}

	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * @param in the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue readDataFile (Scanner in) {
		Queue shapeQueue = new Queue ();
		
		//TODO:  Your loop goes here.
		
		return shapeQueue;
	}
	
	/**
	 * Method to read the file and return a queue of shapes from this file.  The program should handle
	 * the file not found exception here and shut down the program gracefully.
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue readFile (String filename) throws FileNotFoundException {
		File file = new File(filename);
		if (!file.exists()) {
			throw new FileNotFoundException("input file not found");
		}

		Scanner in = new Scanner(file);
		
		//TODO:  Read the input file specified by "filename" and return a queue containing
		//All of the shapes specified in this file
		
		//WARNING:  Do not put all of the code to read the file in this method.  Please,
		//break it up into smaller methods.  If you put all the code to read the file here
		//you'll lose style marks and it will be much, much harder to program.  
		
		return ReadShapeFile.readDataFile(in);
	}
}