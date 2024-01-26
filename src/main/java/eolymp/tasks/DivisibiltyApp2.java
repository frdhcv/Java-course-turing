package eolymp.tasks;

import java.util.Scanner;

public class DivisibiltyApp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a % b == 0 && a % c == 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
