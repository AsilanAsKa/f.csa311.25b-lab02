package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(4);

        Renderer[] renderers = { new Renderer(circle), new Renderer(rectangle), new Renderer(square) };

        for (Renderer renderer : renderers) {
            renderer.draw();
        }
    }
}
