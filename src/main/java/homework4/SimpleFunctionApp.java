package homework4;

import java.util.Scanner;

public class SimpleFunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double res= a+Math.sin(a);
        System.out.printf("%.4f", res);
    }
}