package eolymp.tasks;

import java.util.Scanner;

public class NextOddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        a++;
        if (a % 2 == 0) a++;
        System.out.println(a);
    }
}
