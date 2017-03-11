/**
 * Created by callum on 09/03/2017.
 */
import java.awt.*;

public class Pentagon extends ClosedShape {
    private int side;

    /**
     * create a new pentagon
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param side The side length of the square.
     * @param primaryColour The primary line colour or fill colour.
     * @param secondaryColour The secondary line colour or fill colour.
     * @param isFilled True if the square is filled with colour, false if opaque.
     */
    public Pentagon(int insertionTime, int x, int y, int vx, int vy, int side, Color primaryColour, Color secondaryColour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, primaryColour, secondaryColour, isFilled);
        this.side = side;
    }

    /**
     * @return side length
     */
    public int getSide() {
        return side;
    }

    /**
     * set side length
     * @param side
     */
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * @return width of pentagon
     */
    public int getWidth() {
        return getHeight();
    }

    /**
     * @return height of pentagon
     */
    public int getHeight() {
        // pentagon formula: height = side / 2 * √ (5 + 2) * √5
        return (side / 2) * (int)Math.sqrt(5 + 2 + Math.sqrt(5));
    }

    /**
     * draw the pentagon
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(Graphics g) {
        g.setColor(primaryColour);
        Polygon p = new Polygon();

        // angle between indicies
        double angle = 2 * Math.PI / 5;

        // equation for pentagon point at index i is:
        // (72 * cos(2pi/5 * n), 72 * sin(2pi/5 * n))
        for (int i = 0; i < 5; i++) {
            int x = xPos + (int)(72 * Math.cos(angle * i));
            int y = yPos + (int)(72 * Math.sin(angle * i));
            p.addPoint(x, y);
        }
        if (isFilled) {
            g.fillPolygon(p);
        } else {
            g.drawPolygon(p);
        }
    }
}
