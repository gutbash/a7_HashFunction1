//// a7_HashFunction1
// program for testing the performance of different hash functions for CSCI 211
// last edited Oct. 31, 2022 by S. Gutierrez

package edu.ccp.hashfunction; // includes project package

/**
 * Main
 * driver code for Hash operations
 */
public class Main {
    
    /**
     * MAIN METHOD / DRIVER CODE
     */
    public static void main(String[] args) {
        
        // test cases using simple hash function
        System.out.println("\nSIMPLE HASH FUNCTION TEST CASES: \n");

        Hash.test_shash_function(127, 100);
        Hash.test_shash_function(512, 500);
        Hash.test_shash_function(1024, 1000);
        Hash.test_shash_function(27000, 25000);

        // test cases using custom hash function
        System.out.println("\nCUSTOM HASH FUNCTION TEST CASES: \n");

        Hash.test_chash_function(127, 100);
        Hash.test_chash_function(512, 500);
        Hash.test_chash_function(1024, 1000);
        Hash.test_chash_function(27000, 25000);

    } // ends main() method
} // ends Main class
