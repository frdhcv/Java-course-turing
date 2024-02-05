package eolymp.array.tasks;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = (a / 10) + (a % 10);
        int res = b * b;
        System.out.println(res);
    }
}
