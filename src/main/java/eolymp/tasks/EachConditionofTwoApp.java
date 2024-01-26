package eolymp.tasks;

import java.util.Scanner;

public class EachConditionofTwoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 3 == 0 && ((a > 9 && a < 100 || a < -9 && a > -100) && a % 2 == 0)) System.out.println("YES");
        else System.out.println("NO");
    }
}
