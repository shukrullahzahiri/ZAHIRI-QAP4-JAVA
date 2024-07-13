public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Ellipse("Ellipse", 5, 3),
            new Circle("Circle", 4),
            new Triangle("Triangle", 3, 4, 5),
            new EquilateralTriangle("EquilateralTriangle", 6)
        };

        System.out.println("Shapes before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes(shapes, 2);

        System.out.println("\nShapes after scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
