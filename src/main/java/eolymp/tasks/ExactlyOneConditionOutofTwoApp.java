package eolymp.tasks;

import java.util.Scanner;

public class ExactlyOneConditionOutofTwoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0 && (a < 0 && a % 3 == 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}
