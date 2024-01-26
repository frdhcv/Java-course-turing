package eolymp.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Math.min(a, b) + " " + Math.max(a, b));
    }
}
