/*Java Program to Find the Largest Among Three Numbers*/
package com.corejava;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers :");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int largest=0;
        sc.close();
        if (first > second && first > third)
            largest = first;

        else if (second > first && second > third)
            largest = second;

        else
            largest = third;
        System.out.println("Largest one Among three : " + largest);
    }
}

