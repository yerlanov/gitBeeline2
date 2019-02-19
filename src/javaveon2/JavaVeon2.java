/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaveon2;

import java.util.Scanner;

/**
 *
 * @author Райымбек
 */
public class JavaVeon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The size of array: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            int j = i;
            System.out.print("Type the " + ++j + " element of the array: ");
            array[i] = input.nextInt();
        }
        System.out.println("Sum of Integer is: " + sum(array, 0));
    }

    public static int sum(int[] arr1, int index) {
        if (arr1.length <= index) {
            return 0;
        }
        return arr1[index] + sum(arr1, index + 1);
    }
}
