package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AdditionNo {
    public static void main(String[] args) {
        int a, b, c, n, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        n= sc.nextInt();
        a=n%10;
        n=n/10;
        b=n%10;
        n=n/10;
        c=n%10;

        d=a+b+c;
        System.out.println("Addition of the digits= "+d);



    }
}
