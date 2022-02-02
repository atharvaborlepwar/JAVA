package com.company;

import java.util.Scanner;
public class AreaCircle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of Circle ");
        double a,r,c;
        r=sc.nextDouble();
        a=3.14*r*r;
        c=2*3.14*r;
        System.out.println("Area= "+a);
        System.out.println("Perimeter= "+c);

    }

}