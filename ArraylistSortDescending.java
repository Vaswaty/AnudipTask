package mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistSortDescending {

    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the ArrayList
        System.out.print("Enter the size of the ArrayList: ");
        int size = scanner.nextInt();

        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Prompt the user to enter elements for the ArrayList
        System.out.println("Enter elements for the ArrayList:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Sort the ArrayList in descending order
        Collections.sort(arrayList, Collections.reverseOrder());

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList (Descending Order): " + arrayList);

        }
}


