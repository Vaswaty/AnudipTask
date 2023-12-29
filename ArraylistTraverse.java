package mytest;
import java.util.ArrayList;

public class ArraylistTraverse {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Traverse the ArrayList using a for loop
        for (int i = 0; i < numbers.size(); i++) {
            // Get the element at the current index
            int element = numbers.get(i);

            // Display the current element
            System.out.println("Element at index " + i + ": " + element);
        }
    }
}



