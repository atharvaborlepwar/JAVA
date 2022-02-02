package com.company;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        String name;
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello " + name);

    }
}
