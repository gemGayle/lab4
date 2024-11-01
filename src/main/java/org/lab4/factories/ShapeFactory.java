package org.lab4.factories;

import org.lab4.shapes.IShape;
import org.lab4.shapes.Line;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creating and managing Flyweight objects.
 */
public class ShapeFactory {
    private static final Map<String, IShape> shapes = new HashMap<>();

    /**
     * Returns a line object of the specified color. If the object already exists, returns it;
     * otherwise, creates a new one.
     *
     * @param color the color of the line
     * @return a line object
     */
    public static IShape getLine(String color) {
        Line line = (Line) shapes.get(color);
        if (line == null) {
            line = new Line(color);
            shapes.put(color, line);
            System.out.println("Created new line object of color " + color);
        }
        return line;
    }
}
