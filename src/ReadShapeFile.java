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
	public static Queue readFile (String filename) {
		//HINT:  You might want to open a file here.
		Scanner in = null; //TODO: Change this to construct a proper scanner.
		
		//TODO:  Read the input file specified by "filename" and return a queue containing
		//All of the shapes specified in this file
		
		//WARNING:  Do not put all of the code to read the file in this method.  Please,
		//break it up into smaller methods.  If you put all the code to read the file here
		//you'll lose style marks and it will be much, much harder to program.  
		
		return ReadShapeFile.readDataFile(in);
	}
}