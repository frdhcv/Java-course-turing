package eolymp.tasks;

import java.util.Scanner;

public class DivisibiltyApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            System.out.print(a / b + " " + a % b);
        }
        input.close();
    }
}
