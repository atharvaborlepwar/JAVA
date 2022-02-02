package com.company;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        int n,s,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=sc.nextInt();
        s=n*n;
        c=n*n*n;
        System.out.println("Square= "+s);
        System.out.println("Cube= "+c);

    }
}
