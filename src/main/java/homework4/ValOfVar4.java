package homework4;

import java.util.Scanner;

public class ValOfVar4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double res= a-((a*a+4)/2)+a*a*a-(3/(a+7));
        System.out.printf("%.3f", res);
    }
}