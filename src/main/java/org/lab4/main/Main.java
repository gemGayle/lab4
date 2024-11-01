package org.lab4.main;

import org.lab4.factories.ShapeFactory;
import org.lab4.shapes.IShape;
import org.lab4.shapes.Rectangle;
import org.lab4.shapes.Triangle;

/**
 * Main class of the program for testing the functionality of the graphic editor.
 */
public class Main {
    /**
     * The entry point of the program. Creates and draws graphic objects.
     *
     * @param args command-line parameters (not used)
     */
    public static void main(String[] args) {
        // Using Flyweight for lines
        IShape redLine = ShapeFactory.getLine("червоний");
        IShape greenLine = ShapeFactory.getLine("зелений");

        // Creating a rectangle and triangle as compositions
        Rectangle rectangle = new Rectangle(redLine, greenLine, redLine, greenLine);
        Triangle triangle = new Triangle(redLine, redLine, greenLine);

        // Performing the drawing
        System.out.println("Малюємо лінії та фігури:");
        redLine.draw(10, 20);
        rectangle.draw(50, 60);
        triangle.draw(100, 120);
    }
}
