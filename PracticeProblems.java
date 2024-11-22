public class PracticeProblems {
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
    public static void main(String[] args) {
        int n = 7; // Find the 7th Fibonacci number
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}





    
              