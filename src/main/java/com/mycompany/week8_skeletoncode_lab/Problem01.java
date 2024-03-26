/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
    //          Space Complexity: O(1)
    //          Time Complexity: O(n√n)

        long sum = 0;
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        long sum = getSumOfPrimes(n);
        System.out.println("Sum of prime numbers between 1 and " + n + " is: " + sum);
    }
}
