package lesson06;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int a = input.nextInt();
        System.out.println("Enter the number 2: ");
        int b = input.nextInt();
        System.out.println("The answer is: " + a % b);
    }
}
