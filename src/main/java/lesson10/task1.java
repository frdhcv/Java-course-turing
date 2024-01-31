package lesson10;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sum(scanner.nextInt(), scanner.nextDouble());
    }

    public static void sum(int num1, double num2) {
        System.out.println(num1 + 2);
        System.out.println(num2 + 2);
    }
}