public class PracticeProblems {
    static double sumGrid(double[][] grid) {
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
    public static void main(String[] args) {
    double[][] grid = {
        {1.2, 2.3, 3.4},
        {4.5, 5.6, 6.7},
        {7.8, 8.9, 9.0}
    };
    double totalSum = sumGrid(grid);
    System.out.println("The sum of all elements in the grid is: " + totalSum);
         }
        }





    
              