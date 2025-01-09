package com.lijo.basics.functions;

import java.util.Scanner;

/**
 * Definition: Linear search is a simple search algorithm where you sequentially check each element of a list or array
 * until the target element is found or the end of the list is reached.
 * When to Use: It's useful for small datasets or when the data isn't sorted.
 */
public class LinearSearch {

    // Linear search function
    public static int linearSearch(int[] array, int target) {
        // Loop through each element of the array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element matches the target
            if (array[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int result = linearSearch(array, target);

        // Output result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }

}
