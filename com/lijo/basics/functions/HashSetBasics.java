package com.lijo.basics.functions;

import java.util.HashSet;
/**
 * Definition: A HashSet is a collection in Java that stores unique elements.
 * It uses a hashing mechanism for fast lookup, insertion, and deletion.
 * Key Features:
 * Does not allow duplicates.
 * Elements are unordered.
 * Allows one null value.
 */
public class HashSetBasics {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the set.");
        } else {
            System.out.println("Banana is not in the set.");
        }

        // Remove an element
        set.remove("Cherry");
        System.out.println("After removing Cherry: " + set);

        // Iterate through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
