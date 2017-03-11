/**
 * Created by callum on 09/03/2017.
 */
import java.awt.*;

public class Pentagon extends ClosedShape {
    private int side;

    public Pentagon(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getWidth() {
        return getHeight();
    }

    // h = a / 2 * √ (5 + 2) * √5
    public int getHeight() {
        return (side / 2) * (int)Math.sqrt(5 + 2 + Math.sqrt(5));
    }

    public void draw(Graphics g) {
        g.setColor(colour);
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
