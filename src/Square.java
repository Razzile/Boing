/**
 * Square.java
 * @version 1.0.0
 * Created by Callum Taylor
 */

import java.awt.*;

public class Square extends ClosedShape {
    // length of the sides
    private int side;

    /**
     * create a new square
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param side The side length of the square.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the square is filled with colour, false if opaque.
     */
    public Square(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.side = side;
    }

    /**
     * @return side length
     */
    public int getSide() {
        return side;
    }

    /**
     * sets the side length
     * @param side
     */
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * @return square height
     */
    public int getHeight() {
        return side;
    }

    /**
     * @return square width
     */
    public int getWidth() {
        return side;
    }

    /**
     * draws the square
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(Graphics g) {
        if (isFilled) {
            g.fillRect(xPos, yPos, side, side);
        } else {
            g.fillRect(xPos, yPos, side, side);
        }
    }

    /**
     * @return A human-readable description of the square
     */
    public String toString() {
        String result = "This is a square\n";
        result += super.toString ();
        result += "Its sides are of length " + this.side + "\n";

        return result;
    }
}
