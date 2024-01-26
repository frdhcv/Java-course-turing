package eolymp.tasks;

import java.util.Scanner;

public class NoneOfTheTwoConditionsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0 && a > 0) System.out.println("NO");
        else if (a % 2 != 0 && a < 0) System.out.println("NO");
        else System.out.println("YES");
    }
}
