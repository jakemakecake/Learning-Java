package java102;

public class Square implements Shape {
    public final Point corner;
    public final double sideLength;

    /**
    * @param corner The bottom left corner of the square
    * @param sideLength The length of each side of the square
    */
    public Square(Point corner, double sideLength) {
        this.corner = corner;
        this.sideLength = sideLength;
    }

    // Method to calculate the area of the square
    public double area() {
        return sideLength * sideLength; // Area = sideLength^2
    }

    // Method to calculate the perimeter of the square
    public double perimeter() {
        return 4 * sideLength; // Perimeter = 4 * sideLength
    }

    /** 
    * @return Whether point p is inside of the square.
    */
    public boolean isInside(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        return 0 < xDist && xDist < sideLength &&
               0 < yDist && yDist < sideLength;
    }

    /** 
    * @return Whether point p is part of/on the border of the square.
    */
    public boolean isOn(Point p) {
        double xDist = p.x - corner.x;
        double yDist = p.y - corner.y;
        return (xDist == 0 || xDist == sideLength) && 0 <= yDist && yDist <= sideLength ||
               (yDist == 0 || yDist == sideLength) && 0 <= xDist && xDist <= sideLength;
    }

    /** 
    * @param x How much to translate the square by in the +x direction.
    * @param y How much to translate the square by in the +y direction.
    * @return The square that results from the translation.
    */
    public Square translate(double x, double y) {
        return new Square(new Point(corner.x + x, corner.y + y), sideLength);
    }

    /** 
    * @return The square that results from scaling the side length and maintaining the bottom left corner.
    */
    public Square scale(double k) {
        return new Square(corner, sideLength * k); // Scale the side length by factor k
    }

    // Method to calculate the coordinates of all four corners of the square
    public Point[] corners() {
        Point[] corners = new Point[4];
        corners[0] = corner; // Bottom-left corner
        corners[1] = new Point(corner.x + sideLength, corner.y); // Bottom-right corner
        corners[2] = new Point(corner.x + sideLength, corner.y + sideLength); // Top-right corner
        corners[3] = new Point(corner.x, corner.y + sideLength); // Top-left corner
        return corners;
    }

    @Override
    public String toString() {
        return "(corner: " + corner + "; side length: " + sideLength + ")";
    }
}
