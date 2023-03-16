package com.linecomparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coordinate values of Line 1 :");
        System.out.println("Enter the x1 coordinate values of line 1 :");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y1 coordinate values of line 1 :");
        double y1 = scan.nextDouble();
        System.out.println("Enter the x2 coordinate values of line 1 :");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y2 coordinate values of line 1 :");
        double y2 = scan.nextDouble();

        System.out.println("Enter the coordinate values of Line 2 :");
        System.out.println("Enter the m1 coordinate values of line 1 :");
        double m1 = scan.nextDouble();
        System.out.println("Enter the n1 coordinate values of line 1 :");
        double n1 = scan.nextDouble();
        System.out.println("Enter the m2 coordinate values of line 1 :");
        double m2 = scan.nextDouble();
        System.out.println("Enter the n2 coordinate values of line 1 :");
        double n2 = scan.nextDouble();

        scan.close();
        double length1=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double length2=Math.sqrt(Math.pow((m2-m1),2) + Math.pow((n2-n1),2));
        if (length1 == length2){
            System.out.println("Lengths of two lines are equal .");
        }else if(length1 > length2) {
            System.out.println("Line1 is longer than Line2.");
        }
        else {
            System.out.println("Line2 is longer than Line1.");
        }
    }

}
