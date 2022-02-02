package com.company;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args){
        int l,b,a,p;
        System.out.println("Enter the Length and Breadth");
        Scanner sc= new Scanner(System.in);
        l= sc.nextInt();
        b= sc.nextInt();
        a=l*b;
        p=2*(l+b);
        System.out.println("Area of Rectangle= "+a);
        System.out.println("Perimeter of Rectangle= "+p);



    }
}
