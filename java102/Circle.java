package java102;

public class Circle implements Shape {
    public final Point center;
    public final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * @return Whether point p is inside of the circle.
     */
    public boolean isInside(Point p) {
        return Point.distance(center, p) < radius;
    }

    /**
     * @return Whether point p is part of/on the border of the circle.
     */
    public boolean isOn(Point p) {
        return Point.distance(center, p) == radius;
    }

    /**
     * @param x How much to translate the circle by in the + x direction.
     * @param y How much to translate the circle by in the + y direction.
     * @return The circle that results from the translation.
     */
    public Circle translate(double x, double y) {
        return new Circle(center.translateX(x).translateY(y), radius);
    }

    /**
     * @return The circle that results from scaling by k.
     */
    public Circle scale(double k) {
        return new Circle(center, radius * k);
    }

    /**
     * Generates a Circle from three points that lie on its edge.
     * @param p1 First point
     * @param p2 Second point
     * @param p3 Third point
     * @return The circle passing through the three points
     */
    public static Circle fromPoints(Point p1, Point p2, Point p3) {
        // Calculate the midpoints of two edges
        Point midAB = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        Point midBC = new Point((p2.x + p3.x) / 2, (p2.y + p3.y) / 2);

        // Slopes of the two edges
        double slopeAB = (p2.y - p1.y) / (p2.x - p1.x);
        double slopeBC = (p3.y - p2.y) / (p3.x - p2.x);

        // Perpendicular slopes
        double perpSlopeAB = -1 / slopeAB;
        double perpSlopeBC = -1 / slopeBC;

        // Solve for the intersection of the perpendicular bisectors
        double centerX = ((perpSlopeAB * midAB.x - midAB.y) - (perpSlopeBC * midBC.x - midBC.y))
                / (perpSlopeAB - perpSlopeBC);
        double centerY = perpSlopeAB * (centerX - midAB.x) + midAB.y;

        Point center = new Point(centerX, centerY);

        // Calculate the radius as the distance from the center to any of the points
        double radius = Point.distance(center, p1);

        return new Circle(center, radius);
    }

    @Override
    public String toString() {
        return "(center: " + center + "; radius: " + radius + ")";
    }
}




