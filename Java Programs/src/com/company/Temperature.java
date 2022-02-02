package com.company;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        double temperature,f;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Temerature in Degrees");
        temperature=sc.nextDouble();
        f= (temperature*1.8)+32;
        System.out.println("Temperature in Degrees= "+temperature);
        System.out.println("Temperature in Fahrenheit= "+f);


    }
}
