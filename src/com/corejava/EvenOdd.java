/*Java Program to Check Whether a Number is Even or Odd*/
package com.corejava;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
       int input = sc.nextInt();
        sc.close();
        if (input % 2 == 0)
            System.out.println(input + " is an even number");
        else
            System.out.println(input + " is an odd number ");
    }
}
