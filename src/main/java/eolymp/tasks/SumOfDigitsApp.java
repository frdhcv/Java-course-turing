package eolymp.tasks;

import java.util.Scanner;

public class SumOfDigitsApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println((a / 1000) + (a % 10));
        input.close();
    }
}