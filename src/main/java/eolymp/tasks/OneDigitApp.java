package eolymp.tasks;

import java.util.Scanner;

public class OneDigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >-10 && a < 10) System.out.println("OK");
        else System.out.println("NO");
    }
}
