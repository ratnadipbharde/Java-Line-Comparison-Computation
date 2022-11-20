package org.example;

import sun.security.util.Length;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayMessage();
       // System.out.println("Length of Line is : " + obj.getLength());//for calculate length
        System.out.println("-------------------------------------------");
        Main obj1 = new Main();
        System.out.println("Enter values for First Line ");
        String firstLength = String.valueOf(obj.getLength());
        System.out.println();
        System.out.println("Enter values for Second Line ");
        String secondLength = String.valueOf(obj1.getLength());
        if (firstLength.equals(secondLength)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    private double getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------For 1st point-------- ");
        System.out.print("Enter value of x : ");
        int x1 = sc.nextInt();
        System.out.print("Enter value of y : ");
        int y1 = sc.nextInt();
        System.out.println();
        System.out.println("-------For 2nd point-------- ");
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