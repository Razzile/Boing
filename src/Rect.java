/**
 * Rect.java
 * @version 1.0.0
 * Created by Callum Taylor
 */

import java.awt.*;

public class Rect extends ClosedShape {
    // width and height of the rectangle
    private int width, height;

    /**
     * create a new rectangle
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param width The width of the rectangle.
     * @param height The height of the rectangle.
     * @param primaryColour The primary line colour or fill colour.
     * @param secondaryColour The secondary line colour or fill colour.
     * @param isFilled True if the rectangle is filled with colour, false if opaque.
     */
    public Rect(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color primaryColour, Color secondaryColour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, primaryColour, secondaryColour, isFilled);
        this.width = width;
        this.height = height;
    }

    /**
     * @return the width of the rectangle
     */
    public int getWidth() {
        return width;
    }

    /**
     * set the width of the rectanlge
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height of the rectangle
     */
    public int getHeight() {
        return height;
    }

    /**
     * set the height of the rectangle
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * draws the rectangle
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(Graphics g) {
        g.setColor(primaryColour);
        if (isFilled) {
            g.fillRect(xPos, yPos, width, height);
        } else {
            g.drawRect(xPos, yPos, width, height);
        }
    }

    /**
     * @return A human-readable description of the rectangle
     */
    public String toString() {
        String result = "This is a square\n";
        result += super.toString ();
        result += "It has a width of " + width + " and a height of " + height + "\n";

        return result;
    }
}
