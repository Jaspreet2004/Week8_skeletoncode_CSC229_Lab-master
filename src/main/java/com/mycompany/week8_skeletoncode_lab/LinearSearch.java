/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - provide asymptotic analysis of the developed solution

        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i; // Return the index of the element if found
        }
        return -1; // Return -1 if the element is not found
    }

    }
