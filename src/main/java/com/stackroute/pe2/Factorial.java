package com.stackroute.pe2;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        Factorial factorial = new Factorial();
        factorial.findFactorial();
    }

    int number;
    int factorial = 1;
    Scanner scanner = new Scanner(System.in);

    public void findFactorial() {
        System.out.println("Enter the number");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

            if (factorial < 2147483647 && factorial > -2147483648) {
                System.out.println("factorial of " + i + " is " + factorial);

            } else {
                System.out.println("factorial of " + i + " is out of range");
                break;

            }
        }
    }
}