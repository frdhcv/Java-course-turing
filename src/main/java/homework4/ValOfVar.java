package homework4;

import java.util.Scanner;

public class ValOfVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = Math.sqrt((Math.pow(a, 4) + 1)) / Math.pow(a, 2);
        double c = Math.sqrt(Math.pow(a, 2) / (Math.pow(a, 2) + 1));
        System.out.println(b - c);
    }
}
