package com.bridgelap;
import java.util.Scanner;
import static java.lang.Double.compare;
public class LineComparison {

    public static void lineComparison(){
        System.out.println("Welcome to Line Comparsion");
        Scanner sc = new Scanner(System.in);
        float x1, y1, x2, y2;

        System.out.println("Enter x1 y1 x2 y2: ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(length1);
        System.out.println("Enter x1 y1 x2 y2 of line two: ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();

        double length2 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(length2);
        int x = compare(length1, length2);
        System.out.println(x);
        if (x == 0) {
            System.out.println("Both the lines are equal in length. ");
        } else if (x < 0)
            System.out.println("line one is smaller than line two. ");
        else {


            System.out.println("line one is larger than line two. ");

        }
    }
         public static void main(String[] args){
        lineComparison();
         }

}
