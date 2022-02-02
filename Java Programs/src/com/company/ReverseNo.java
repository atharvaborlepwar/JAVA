package com.company;


import java.util.Scanner;
    public class ReverseNo{
        public static void main(String[] args){
            int a,b,c,d;
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Number to reverse");
            a=sc.nextInt();
            b=a/10;
            c=a%10;
            d=b+c*10;
            System.out.println(d);
        }
    }

