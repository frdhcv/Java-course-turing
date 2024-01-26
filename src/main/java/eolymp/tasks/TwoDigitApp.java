package eolymp.tasks;

import java.util.Scanner;

public class TwoDigitApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > -100 && a < -9) System.out.println("OK");
        else if (a < 100 && a > 9) System.out.println("OK");
        else System.out.println("NO");
    }
}
