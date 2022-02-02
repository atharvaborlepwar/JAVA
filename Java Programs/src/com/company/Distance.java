package com.company;


import java.util.Scanner;
    public class Distance{
        public static void main(String[] args){
            double dist,cms,inches,feet;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Distance in Meters to convert");

            dist= sc.nextDouble();
            cms= dist*100;
            inches=dist*39.37;
            feet=dist*3.2;

            System.out.println("Distance in Centimeters="+cms);
            System.out.println("Distance in Inches="+inches);
            System.out.println("Distance in Feet="+feet);
        }
    }

