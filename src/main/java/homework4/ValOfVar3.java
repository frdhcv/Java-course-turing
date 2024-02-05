package homework4;

import java.util.Scanner;

public class ValOfVar3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double p1 = (a*a+3*a-4)/(2*a-3);
        double p2=(a+2)/(a*a-5*a+7);
        double res = p1 - p2;
        System.out.printf("%.3f", res);
    }
}
