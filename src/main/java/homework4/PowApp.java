package homework4;

import java.util.Scanner;

public class PowApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((int) Math.pow(a, b));
    }
}