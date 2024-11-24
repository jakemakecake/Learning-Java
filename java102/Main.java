package java102;

public class Main {
            public static void main(String[] args) {
                // Create an array of points
                Point[] points = {
                    new Point(1, 1),
                    new Point(2, 3),
                    new Point(4, 5),
                    new Point(6, 7)
                };
        
                // Calculate the center of mass
                Point center = Point.centerOfMass(points);
        
                // Print the result
                System.out.println("Center of mass: (" + center.x + ", " + center.y + ")");
            }
        }   
        
    

