package org.lab4.shapes;

/**
 * Class representing a line as a graphic object.
 */
public class Line implements IShape {
    private String color;

    /**
     * Constructor that sets the color of the line.
     *
     * @param color the color of the line
     */
    public Line(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Draw method with parameters x=" + x + " y=" + y + ", line color " + color);
    }
}
