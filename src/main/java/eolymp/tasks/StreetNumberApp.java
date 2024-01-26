package eolymp.tasks;

import java.util.Scanner;

public class StreetNumberApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if ((a + b) % 2 == 0) {
            System.out.println("1");
        } else System.out.println("0");
        input.close();
    }
}