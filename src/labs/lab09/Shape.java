
package labs.lab09;

import java.awt.Color;

public class Shape {
    public int x, y, w, h;
    private int dirX, dirY;
    private SHAPE_TYPE shapeType;
    private Color colour;

    public static int worldW;
    public static int worldH;

    public Shape(int x, int y, int w, int h,
                 int dirX, int dirY,
                 SHAPE_TYPE shapeType, Color colour) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.dirX = dirX;
        this.dirY = dirY;
        this.shapeType = shapeType;
        this.colour = colour;
    }

    public Shape(int x, int y, int w, int h,
                 SHAPE_TYPE shapeType, Color colour) {
        this(x, y, w, h, 1, 1, shapeType, colour);
    }

    public SHAPE_TYPE getShapeType() {
        return shapeType;
    }

    public Color getColour() {
        return colour;
    }

    public void move() {
        x += dirX;
        y += dirY;

        if (x < 0) {
            x = 0;
            dirX = -dirX;
        }
        if (y < 0) {
            y = 0;
            dirY = -dirY;
        }
        if (x + w > worldW) {
            x = worldW - w;
            dirX = -dirX;
        }
        if (y + h > worldH) {
            y = worldH - h;
            dirY = -dirY;
        }
    }

    public static void setWorld(int w, int h) {
        worldW = w;
        worldH = h;
    }
}
