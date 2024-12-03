package java102;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Library items initialization
        LibraryItem[] items = {
            new Book("The Great Gatsby", "B001", "F. Scott Fitzgerald", 180),
            new DVD("Inception", "D001", 148.0),
            new Book("1984", "B002", "George Orwell", 328)
        };

        // Check out some items
        items[1].checkOut(); // Check out "Inception"

        // Get available items
        ArrayList<LibraryItem> available = availableItems(items);

        // Output available items
        System.out.println("Available items:");
        for (LibraryItem item : available) {
            System.out.println(item);
        }

        // Check out all items
        items[0].checkOut();
        items[1].checkOut();

        // Return all items
        returnAll(items);

        // Verify items are returned
        for (LibraryItem item : items) {
            System.out.println(item.title + " is available: " + item.available());
        }

        // Shape-related operations
        Shape[] shapes = {
            new Circle(new Point(1.8, -20), 2), 
            new Square(new Point(100, 2.1), 5.4),
            new Circle(new Point(0, 0), 1),
            new Circle(new Point(4, 9.123), 98.32),
            new Square(new Point(-321, 0), 0.02)
        };

        System.out.println(sumArea(shapes));
    }

    /**
     * Returns an ArrayList of available LibraryItem objects.
     * @param items An array of LibraryItem objects.
     * @return An ArrayList containing only the available items.
     */
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> available = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.available()) {
                available.add(item);
            }
        }
        return available;
    }

    /**
     * Returns all LibraryItem objects in the array to the library.
     * @param items An array of LibraryItem objects.
     */
    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();
        }
    }

    /**
     * Calculates the total area of the shapes in the given array.
     * @param shapes An array of Shape objects.
     * @return The sum of the areas of the shapes.
     */
    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

    /**
     * Scales all shapes in the array by a given factor.
     * @param shapes An array of Shape objects.
     * @param k The scaling factor.
     * @return A new array of scaled shapes.
     */
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }
}


    




      
   

         