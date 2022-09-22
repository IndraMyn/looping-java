/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input x : ");
        int x = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= x; ++i) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("------------------------");

        // 1 2 buzz 4 5 buzz
        for (int i = 1; i <= x; i++) {

            if (i % 3 == 0) {
                System.out.print("buzz");
            } else {
                System.out.print(" " + i + " ");
            }

        }

        System.out.println("\n------------------------");

        // 1 4 2 buzz(2 5 3) 3 6 4 buzz (4 7 5)
        int y = 0;

        for (int i = 1; i <= x; i++) {

            System.out.print(i);

            for (int j = 3; j <= 3; j++) {

                y = i + j;
                if (y % 2 != 0) {
                    System.out.print("buzz");
                }
                System.out.print(" " + y + " ");

            }
        }

    }
}
