/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algo;

/**
 *
 * @author ACER
 */

import java.util.Random;


public class Algo {

    /**
     * @param args the command line arguments
     */
    
    
     // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target if found
            }
        }
        return -1; // Return -1 if target is not found
    }
    
    public static void main(String[] args) {
        int size = 100000000; // 1 million
        int[] largeArray = new int[size];

        // Initialize Random object
        Random random = new Random();

        // Fill the array with random numbers between 0 and 1 million
        for (int i = 0; i < size; i++) {
            largeArray[i] = random.nextInt(size) + 1; // Generates a random number between 1 and size
        }

        // Print all random numbers
        System.out.println("Printing all random numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println(largeArray[i]); // Print each number on a new line
        }

        int target = 500000; // Value to search for

        // Perform the linear search
        long startTime = System.nanoTime(); // Record start time
        int index = linearSearch(largeArray, target);
        long endTime = System.nanoTime(); // Record end time

        // Print the result of the search
        if (index != -1) {
            System.out.println("Index of target " + target + ": " + index);
        } else {
            System.out.println("Target not found.");
        }

        // Print the time taken for the search
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000 + " milliseconds");
    }
    

}
