package homework4;

import java.util.Scanner;

public class ValofVar5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double res= (a*a*a)-5*(a*a)/7+9*a-3/a+1;
        System.out.printf("%.3f", res);
    }
}