package com.vmstate.am.java.chapter_002;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Mini Calculator ===");
        System.out.print("Enter first number: ");

        double a = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        Double result = compute(a, b, op);
        if (result == null) {
            System.out.println("Error: invalid operator or division/modulo by zero.");
        } else {
            System.out.println("Result: " + result);
        }

        // Bonus: show operator precedence in action
        System.out.println("\nOperator precedence demo:");
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4));
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4));

        sc.close();
    }

    private static Double compute(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                if (b == 0) yield null;
                yield a / b;
            }
            case "%" -> {
                if (b == 0) yield null;
                yield a % b;
            }
            default -> null;
        };
    }
}