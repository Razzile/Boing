/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import com.sun.javaws.exceptions.InvalidArgumentException;
import com.sun.tools.javah.Util;

import java.awt.Color;
import java.io.*;
import java.util.IllegalFormatException;
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
		in.skip("circle");
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
		in.skip("oval");
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
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String shape = line.split(" ")[0];
			switch (shape) {
				case "circle": {
					Circle c = ReadShapeFile.constructCircle(new Scanner(line));
					shapeQueue.enqueue(c);

					break;
				}
				case "oval": {
					Oval o = ReadShapeFile.constructOval(new Scanner(line));
					shapeQueue.enqueue(o);

					break;
				}
			}
		}
		
		return shapeQueue;
	}
	
	/**
	 * Method to read the file and return a queue of shapes from this file.  The program should handle
	 * the file not found exception here and shut down the program gracefully.
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue readFile (String filename) {
		Scanner in = null;
		try {
            File file = new File(filename);

            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
            System.exit(1);
        } catch (Exception e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
        return ReadShapeFile.readDataFile(in);
	}
}