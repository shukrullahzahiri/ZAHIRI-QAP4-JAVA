public class Circle extends Ellipse {
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);  // Reuse the scale method from Ellipse
    }
}
