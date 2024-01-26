package eolymp.tasks;

import java.util.Scanner;

public class WaterIceApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a < 0 || a == 0) System.out.println("Ice");
        else System.out.println("Water");
    }
}
