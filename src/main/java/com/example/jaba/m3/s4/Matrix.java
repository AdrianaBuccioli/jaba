/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m3.s4;

import java.util.Arrays;

/**
 * Defining and using a two-dimensional array
 */
public class Matrix {
    public static void main(String[] args) {
        // four rows, five columns
//        int[][] matrix = new int[4][5];
        int[][] matrix = { //
                { 1, 2, 3, 4, 5 }, //
                { 6, 7, 8, 9, 10 }, //
                { 11, 12, 13, 14, 15 }, //
                { 16, 17, 18, 19, 20 } //
        };

        // reading a value from a matrix
        int value = matrix[2][3];
        System.out.print("The original value in the chosen matrix position is ");
        System.out.println(value);

        // changing a value in a matrix
        matrix[2][3] = 93;

        // very disappointing
        System.out.print("Matrix to string: ");
        System.out.println(matrix.toString());
        // disappointing
        System.out.print("Using Arrays.toString() is not enough for multidimensional arrays: ");
        System.out.println(Arrays.toString(matrix));
        // this is what we need here
        System.out.print("Arrays.deepToString() is what we need here: ");
        System.out.println(Arrays.deepToString(matrix));
    }
}
