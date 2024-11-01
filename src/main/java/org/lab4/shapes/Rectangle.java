package org.lab4.shapes;

/**
 * Class representing a rectangle as a composition of lines.
 */
public class Rectangle implements IShape {
    private IShape line1;
    private IShape line2;
    private IShape line3;
    private IShape line4;

    /**
     * Constructor that sets four lines to form a rectangle.
     *
     * @param line1 the first line
     * @param line2 the second line
     * @param line3 the third line
     * @param line4 the fourth line
     */
    public Rectangle(IShape line1, IShape line2, IShape line3, IShape line4) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Малюємо прямокутник з координатами x=" + x + " y=" + y);
        line1.draw(x, y);
        line2.draw(x + 10, y);
        line3.draw(x, y + 10);
        line4.draw(x + 10, y + 10);
    }
}
