/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) {
                    // swap the elements if they are in the wrong order
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                    //ToDo 3: complete this algorithm, test it, provide its time complexity
                    // Time Complexity: O(n^2)
                }
            }
        }
    }
        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            int size = arr.length;
            bubbleSort(arr, size);
            System.out.println("Sorted array:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
