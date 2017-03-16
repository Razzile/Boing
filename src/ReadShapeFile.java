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
		// diameter
		int diameter = in.nextInt();

		// should be filled
		boolean filled = in.nextBoolean();
		// should flash
		boolean flash = in.nextBoolean();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color primary = new Color(r, g, b);
		// if flashing define secondary
		Color secondary = null;
		if (flash) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();

			secondary = new Color(r, g, b);
		}
		// insertion time
		int insertionTime = in.nextInt();


		return new Circle(insertionTime, px, py, vx, vy, diameter, primary, secondary, filled);
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
		// width and height
		int width = in.nextInt();
		int height = in.nextInt();
		// should be filled
		boolean filled = in.nextBoolean();
		// should flash
		boolean flash = in.nextBoolean();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color primary = new Color(r, g, b);
		// if flashing define secondary
		Color secondary = null;
		if (flash) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();

			secondary = new Color(r, g, b);
		}
		// insertion time
		int insertionTime = in.nextInt();
		return new Oval(insertionTime, px, py, vx, vy, width, height, primary, secondary, filled);
	}

    /**
     * Construct a new square object from a scanner input
     * @param in the scanner of the file
     * @return newly constructed square
     */
	private static Square constructSquare(Scanner in) {
        in.skip("square");
        // position and velocity
        int px = in.nextInt();
        int py = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
		// side length
		int side = in.nextInt();
        // should be filled
		boolean filled = in.nextBoolean();
		// should flash
		boolean flash = in.nextBoolean();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color primary = new Color(r, g, b);
		// if flashing define secondary
		Color secondary = null;
		if (flash) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();

			secondary = new Color(r, g, b);
		}
		// insertion time
		int insertionTime = in.nextInt();

        return new Square(insertionTime, px, py, vx, vy, side, primary, secondary, filled);
    }

    /**
     * Construct a new square object from a scanner input
     * @param in the scanner of the file
     * @return newly constructed square
     */
    private static Rect constructRect(Scanner in) {
        in.skip("rect");
        // position and velocity
        int px = in.nextInt();
        int py = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
		// width and height
		int width = in.nextInt();
		int height = in.nextInt();
        // should be filled
		boolean filled = in.nextBoolean();
		// should flash
		boolean flash = in.nextBoolean();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color primary = new Color(r, g, b);
		// if flashing define secondary
		Color secondary = null;
		if (flash) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();

			secondary = new Color(r, g, b);
		}
		// insertion time
		int insertionTime = in.nextInt();

        return new Rect(insertionTime, px, py, vx, vy, width, height, primary, secondary, filled);
    }

    private static Pentagon constructPentagon(Scanner in) {
		in.skip("pentagon");

		int px = in.nextInt();
		int py = in.nextInt();
		int vx = in.nextInt();
		int vy = in.nextInt();
		// side length
		int side = in.nextInt();
		boolean filled = in.nextBoolean();
		// should flash
		boolean flash = in.nextBoolean();
		// red, green and blue colour values
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color primary = new Color(r, g, b);
		// if flashing define secondary
		Color secondary = null;
		if (flash) {
			r = in.nextInt();
			g = in.nextInt();
			b = in.nextInt();

			secondary = new Color(r, g, b);
		}
		// insertion time
		int insertionTime = in.nextInt();

		return new Pentagon(insertionTime, px, py, vx, vy, side, primary, secondary, filled);
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
            Scanner lineScanner = new Scanner(line);
			ClosedShape obj = null;
			switch (shape) {
				case "circle": {
					obj = constructCircle(lineScanner);
					break;
				}
				case "oval": {
					obj = constructOval(lineScanner);
					break;
				}
                case "square": {
                    obj = constructSquare(lineScanner);
                    break;
                }
                case "rect": {
                    obj = constructRect(lineScanner);
                    break;
                }
				case "pentagon": {
					obj = constructPentagon(lineScanner);
					break;
				}
			}
			shapeQueue.enqueue(obj);
			lineScanner.close();
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