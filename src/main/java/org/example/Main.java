package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayMessage();
        System.out.println("Length of Line is : "+obj.getLength());//for calculate length
    }

    private double getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Line 1 1st point :- ");
        System.out.print("Enter value of x : ");
        int x1 = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y1 = sc.nextInt();
        System.out.println();
        System.out.println("For Line 1 2nd point :- ");
        System.out.print("Enter value of x : ");
        int x2 = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y2 = sc.nextInt();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    private void displayMessage() {
        System.out.println("Welcome to Line Comparison Program");
    }
}