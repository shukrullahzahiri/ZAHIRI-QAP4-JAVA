public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }

    @Override
    public double computePerimeter() {
        return Math.PI * 2 * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2.0);
    }

    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
}
