package eolymp.tasks;

import java.util.Scanner;

public class sgnFunctionApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0) System.out.println("1");
        else if (a == 0) System.out.println("0");
        else System.out.println("-1");
    }
}
