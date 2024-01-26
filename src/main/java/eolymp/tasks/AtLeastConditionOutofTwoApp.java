package eolymp.tasks;

import java.util.Scanner;

public class AtLeastConditionOutofTwoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 != 0||(a>99&&a<1000)) System.out.println("YES");
        else if (a % 2 != 0 && (a>99 && a<1000)) System.out.println("NO");
        else System.out.println("NO");
    }
}
