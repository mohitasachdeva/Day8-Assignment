package com.bridgelap;
import java.util.Scanner;
public class LineComparison {

        public static void main(String[] args) {
            System.out.println("Welcome to Line Comparsion");
            Scanner sc = new Scanner(System.in);
            float x1,y1,x2,y2;

            System.out.println("Enter x1 y1 x2 y2: ");
            x1 = sc.nextFloat();
            y1 = sc.nextFloat();
            x2 = sc.nextFloat();
            y2 = sc.nextFloat();
            double length = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
            System.out.println(length);
        }
    }
