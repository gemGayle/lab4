package org.lab4.shapes;

/**
 * Class representing a triangle as a composition of lines.
 */
public class Triangle implements IShape {
    private IShape line1;
    private IShape line2;
    private IShape line3;

    /**
     * Constructor that sets three lines to form a triangle.
     *
     * @param line1 the first line
     * @param line2 the second line
     * @param line3 the third line
     */
    public Triangle(IShape line1, IShape line2, IShape line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Малюємо трикутник з координатами x=" + x + " y=" + y);
        line1.draw(x, y);
        line2.draw(x + 10, y);
        line3.draw(x + 5, y + 10);
    }
}
