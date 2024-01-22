package lesson06;

import java.util.Scanner;

public class GraduateApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = input.nextInt();
        if (a > 100) {
            System.out.println("Invalid number");
        } else if (a > 90) {
            System.out.println("A");
        } else if (a > 80 && a < 91) {
            System.out.println("B");
        } else if (a > 70 && a < 81) {
            System.out.println("C");
        } else if (a > 60 && a < 71) {
            System.out.println("D");
        } else if (a > 50 && a < 61) {
            System.out.println("E");
        } else
            System.out.println("F");
    }
}
