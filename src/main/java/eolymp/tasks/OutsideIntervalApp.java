package eolymp.tasks;

import java.util.Scanner;

public class OutsideIntervalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a <= c) {
            System.out.println("IN");
        } else System.out.println("OUT");
    }
}