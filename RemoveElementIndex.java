package mytest;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementIndex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Get user input for the index to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to remove: ");
        int indexToRemove = scanner.nextInt();

        // Check if the index is valid
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            // Remove the element at the specified index
            String removedElement = arrayList.remove(indexToRemove);

            // Display the updated ArrayList
            System.out.println("Element removed: " + removedElement);
            System.out.println("Updated ArrayList: " + arrayList);
        } else {
            System.out.println("Invalid index. Please enter a valid index.");
        }

        
    }
}

