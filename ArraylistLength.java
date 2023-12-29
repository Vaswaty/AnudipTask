package mytest;

import java.util.ArrayList; // Import the ArrayList class

public class ArraylistLength {

    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> myArrayList = new ArrayList<>();

        // Add elements to the ArrayList
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");

        // Print the ArrayList
        System.out.println("ArrayList: " + myArrayList);

        // Get and print the length of the ArrayList
        int arrayListLength = myArrayList.size();
        System.out.println("Length of ArrayList: " + arrayListLength);
    }
}

