package java102;

public class RightTriangle implements Shape {
    private final Point corner;
    private final double base;
    private final double height;

    /**
     * Constructs a RightTriangle.
     *
     * @param corner The location of one corner of the right triangle.
     * @param base   The length of the base.
     * @param height The length of the height.
     */
    public RightTriangle(Point corner, double base, double height) {
        this.corner = corner;
        this.base = base;
        this.height = height;
    }

    /**
     * @return The area of the right triangle.
     */
    @Override
    public double area() {
        return 0.5 * base * height;
    }

    /**
     * @return The perimeter of the right triangle.
     */
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return base + height + hypotenuse;
    }

    /**
     * Determines if two RightTriangles are similar.
     *
     * @param t1 The first triangle.
     * @param t2 The second triangle.
     * @return True if the triangles are similar; false otherwise.
     */
    public static boolean similar(RightTriangle t1, RightTriangle t2) {
        double ratio1 = t1.base / t2.base;
        double ratio2 = t1.height / t2.height;
        return Math.abs(ratio1 - ratio2) < 1e-9; // Allow for floating-point precision
    }

    /**
     * @return Whether a point is on the border of the triangle.
     */
    public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;

        // Check if the point is on one of the three sides
        boolean onBase = yDist == 0 && xDist >= 0 && xDist <= base;
        boolean onHeight = xDist == 0 && yDist >= 0 && yDist <= height;

        // Check if the point is on the hypotenuse
        boolean onHypotenuse = yDist == (height / base) * xDist && xDist >= 0 && yDist >= 0;

        return onBase || onHeight || onHypotenuse;
    }

    /**
     * Translates the triangle by the given x and y amounts.
     *
     * @param x Amount to translate in the x-direction.
     * @param y Amount to translate in the y-direction.
     * @return A new RightTriangle after the translation.
     */
    @Override
    public Shape translate(double x, double y) {
        Point newCorner = new Point(corner.x + x, corner.y + y);
        return new RightTriangle(newCorner, base, height);
    }

    /**
     * Scales the triangle by a factor k.
     *
     * @param k Scaling factor.
     * @return A new RightTriangle after scaling.
     */
    @Override
    public Shape scale(double k) {
        return new RightTriangle(corner, base * k, height * k);
    }

    /**
     * @return A string representation of the right triangle.
     */
    @Override
    public String toString() {
        return "RightTriangle[corner=" + corner + ", base=" + base + ", height=" + height + "]";
    }

    /**
     * @return Whether a point is inside the right triangle.
     */
    public boolean isInside(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;

        if (xDist < 0 || yDist < 0 || xDist > base || yDist > height) {
            return false; // Outside the triangle bounds
        }

        // Check if the point is below the hypotenuse
        double hypotenuseSlope = height / base;
        return yDist <= hypotenuseSlope * xDist;
    }
}
