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
        return (int)((side / 2) / (Math.cos(Math.PI / 5)));
    }

    /**
     * @return height of pentagon
     */
    public int getHeight() {
        // pentagon formula: height = side / 2 * √ (5 + 2) * √5
        double r = (side/ 2) / (2 * Math.sin(Math.PI / 5));
        double height =  r * (1 + Math.cos(Math.PI / 5));
        return (int)height;
    }

    /**
     * draw the pentagon
     * @param g The graphics object associated with the drawing component.
     */
    public void draw(Graphics g) {
        g.setColor(primaryColour);
        Polygon p = new Polygon();

        // equation for pentagon point at index i is:
        // (72 * cos(2pi/5 * n), 72 * sin(2pi/5 * n))
        double angle = 2 * Math.PI / 5;
        for (int i = 0; i < 5; i++) {
            int x = xPos + (int)Math.ceil((side * Math.cos(angle * i + -Math.PI / 2)));
            int y = yPos + (int)Math.ceil((side * Math.sin(angle * i + -Math.PI / 2)));
            p.addPoint(x, y);
        }

        if (isFilled) {
            g.fillPolygon(p);
        } else {
            g.drawPolygon(p);
        }
    }
}
