package eolymp.tasks;

import java.util.Scanner;

public class PosNegApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0)
            System.out.println("Positive");
        else if (a == 0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        input.close();
    }
}
