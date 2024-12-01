import java102.Grid;


public class Main {
    public static void main(String[] args) {
        Grid<Integer> grid1 = new Grid<>(3, 0);
        System.out.println("Max side length: " + Grid.maxSideLength()); // Output: 3

        Grid<Integer> grid2 = new Grid<>(5, 0);
        System.out.println("Max side length: " + Grid.maxSideLength()); // Output: 5

        Grid<Integer> grid3 = new Grid<>(4, 0);
        System.out.println("Max side length: " + Grid.maxSideLength()); // Output: 5
    }
}
          