package com.vmstate.am.java.chapter_001;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your age: ");
        int age = sc.nextInt();

        int nextAge = age + 1;

        System.out.println(("Hi " + name + "! Next year you'll be " + nextAge + "."));

        if (age >= 15) {
            System.out.println("You can learn to drive soon!");
        } else {
            System.out.println("A few more years to go-keep learning");
        }
        sc.close();
    }
}
