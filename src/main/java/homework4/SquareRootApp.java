package homework4;

import java.util.Scanner;

public class SquareRootApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double res= Math.sqrt(a);
        System.out.printf("%.6f", res);
    }
}