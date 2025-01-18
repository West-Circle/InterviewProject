package org.interview.common.code;

import java.util.Scanner;

public class ClosestFibonacci {
    public static int findClosestFibonacci(int sum) {
        int a = 0;
        int b = 1;
        while (b < sum) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        if (Math.abs(sum - a) < Math.abs(sum - b)) {
            return a;
        } else
            return b;
    }

    public static void fibonacciIterative(int n) {
        if (n == 0) {
            System.out.print(n);
            return;
        }
        if (n == 1) {
            System.out.print("0" + " " + "1");
            return;
        }
        long a = 0;
        long b = 1;
        int i = 2;
        System.out.print("0" + " " + "1" + " ");
        while (i < n) {
            long temp = a + b;
            if (temp < a || temp < b) {
                System.out.println("\nOverflow occurred. Exiting loop.");
                break;
            }
            a = b;
            b = temp;
            System.out.print(b + " ");
            i++;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. find the closest fibonacci number of the sum of N integer");
            System.out.println("2. print N fibonacci number");
            System.out.println("3. exit");
            sc = new Scanner(System.in);
            System.out.print("Selection: ");
            int selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Sum of those integer");
                System.out.print("How many integer: ");
                int N = sc.nextInt();
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    System.out.print("Input: ");
                    int input = sc.nextInt();
                    sum += input;
                }
                System.out.println("Sum of the integer: " + sum);
                System.out.println("Closest Fibonacci: " + findClosestFibonacci(sum));
                System.out.println("###########################################################");
            } else if (selection == 2) {
                System.out.print("How many fibonacci number you want to print: ");
                int n = sc.nextInt();
                fibonacciIterative(n);
                System.out.println("\n###########################################################");

            } else if (selection == 3) {
                System.exit(0);
            } else {
                System.out.println("Invalid input");
            }
            sc.nextLine();
        }

    }
}
