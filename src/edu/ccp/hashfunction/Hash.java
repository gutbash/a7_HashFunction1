//// a7_HashFunction1
// program for testing the performance of different hash functions for CSCI 211
// last edited Oct. 31, 2022 by S. Gutierrez

package edu.ccp.hashfunction; // includes project package

import java.util.Random; // imports Random for random integer in range

/**
 * Hash
 * contains static methods for hash functions and their test counterparts
 */
public class Hash {

    /**
     * s_hash_function()
     * hashes according to given key and size of array
     */
    public static int s_hash_function(String key, int size) {
        
        // creates hash number to be summed
        int hash = 0;
        
        // iterates through String key and hashes each digit, then sums to hash
        for (int i = 0; i < key.length(); i++) {

            int x = key.charAt(i);
            hash = hash + x;
        
        } // ends for loop
        
        // modulos final hash number to the size of the array
        return Math.abs(hash % size);

    } // ends s_hash_function() method

    /**
     * c_hash_function()
     * hashes according to given key and size of array using custom hashing
     */
    public static int c_hash_function(String key, int size) {

        // creates hash number to be summed
        int hash = 0;
        
        // iterates through String key and hashes each digit, then sums to hash
        for (int i = 0; i < key.length(); i++) {

            int x = key.charAt(i);
            hash = (3 * hash) + x;
        
        } // ends for loop
        
        // modulos final hash number to the size of the array
        return Math.abs(hash % size);

    } // ends c_hash_function() method

    /**
     * test_shash_function()
     * takes in size of array and number of j-numbers to create
     * creates and hashes j-numbers into an array that keeps tracks of collisions
     */
    public static void test_shash_function(int size, int jnums) {

        // instantiates new Random to operate on
        Random random = new Random();

        // instantiates new integer array to store hashed j-numbers
        int[] jNumArr = new int[size];

        // creates and stores a new j-number's index count according to given jnums limit
        for (int i = 0; i < jnums; i++) {

            String jnum = "J" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9)
            + random.nextInt(9) + random.nextInt(9) + random.nextInt(9)
            + random.nextInt(9) + random.nextInt(9);

            int hash = s_hash_function(jnum, size);

            jNumArr[hash]++;

        } // ends for loop

        // creates tracker for collision count
        int collisions = 0;

        // iterates through array and adds up collisions if there is more than one j-num at a given index position
        for(int i = 0; i < size; i++){

            if (jNumArr[i] > 1){

                collisions = collisions + (jNumArr[i] - 1);

            } // ends if statement
        } // ends for loop

        // prints the results
        System.out.println(jnums + " J-NUMS IN ARRAY OF " + size + " // COLLISIONS: " + collisions);

    } // ends test_shash_function() method

    /**
     * test_chash_function()
     * takes in size of array and number of j-numbers to create
     * creates and hashes j-numbers into an array that keeps tracks of collisions
     */
    public static void test_chash_function(int size, int jnums) {

        // instantiates new Random to operate on
        Random random = new Random();

        // instantiates new integer array to store hashed j-numbers
        int[] jNumArr = new int[size];

        // creates and stores a new j-number's index count according to given jnums limit
        for (int i = 0; i < jnums; i++) {

            String jnum = "J" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9)
            + random.nextInt(9) + random.nextInt(9) + random.nextInt(9)
            + random.nextInt(9) + random.nextInt(9);

            int hash = c_hash_function(jnum, size);

            jNumArr[hash]++;

        } // ends for loop

        // creates tracker for collision count
        int collisions = 0;

        // iterates through array and adds up collisions if there is more than one j-num at a given index position
        for(int i = 0; i < size; i++){

            if (jNumArr[i] > 1){

                collisions = collisions + (jNumArr[i] - 1);

            } // ends if statement
        } // ends for loop

        // prints the results
        System.out.println(jnums + " J-NUMS IN ARRAY OF " + size + " // COLLISIONS: " + collisions);

    } // ends test_chash_function() method
} // ends Hash class
