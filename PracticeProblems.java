public class PracticeProblems {
static int countOccurences(int[] arr, int n) {
int count = 0;   
for (int num : arr)
if (num == n) {
   count++;
        } 
return count;
    } 
}




 public static int[] reverseArray(int[] arr) {
      
       int[] reversed = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           reversed[i] = arr[arr.length - 1 - i];
       }
       return reversed;  
   }

public static double sumGrid(double[][] grid) {
       double sum = 0.0; // Initialize a variable to store the sum


       // Loop through each row
       for (int i = 0; i < grid.length; i++) {
           // Loop through each column in the current row
           for (int j = 0; j < grid[i].length; j++) {
               sum += grid[i][j]; // Add the current element to the sum
           }
       }


       return sum; // Return the total sum
   }


static int fib(int n) {
       if (n <= 0) return 0; // Base case: Fibonacci(0) = 0
       if (n == 1) return 1; // Base case: Fibonacci(1) = 1


       int a = 0, b = 1; // Initialize the first two Fibonacci numbers
       int result = 0;


       // Compute the Fibonacci sequence iteratively
       for (int i = 2; i <= n; i++) {
           result = a + b; // The next Fibonacci number
           a = b; // Move to the next pair
           b = result;
       }


       return result; // Return the nth Fibonacci number
   }


public class Point {
       public final double x;
       public final double y;
  
       // Constructor
       public Point(double x, double y) {
           this.x = x;
           this.y = y;
       }
       public Point translateX(double t) {
           return new Point(x + t, y);
       }
       public Point translateY(double t) {
           return new Point(x, y + t);
       }
       public static Point centerOfMass(Point[] points){
           if (points.length == 0){
               return new Point (0, 0);
           }
           double sumX = 0;
           double sumY = 0;


           for (Point p : points) {
               sumX += p.x;
               sumY += p.y;
           }
      
           double centerX = sumX / points.length;
           double centerY = sumY / points.length;
      
           return new Point(centerX, centerY);
       }


       }

public class point {
           public final double x;
           public final double y;
      
           public point(double x, double y) {
               this.x = x;
               this.y = y;
           }
          
// Practice Problem Angle
public double angle() {
   double angleinrads = Math.atan2(y, x);
   double angleindegrees = Math.toDegrees(angleinrads);
   return angleindegrees;
}
       }







    
              