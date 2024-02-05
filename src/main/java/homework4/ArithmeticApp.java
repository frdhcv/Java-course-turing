package homework4;

import java.util.Scanner;

public class ArithmeticApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum = 0;
        for (double i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.printf("%.2f",sum/2);
    }
}