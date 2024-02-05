package homework4;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextInt();
        double b= scanner.nextInt();
        double c=Math.pow(a,2);
        double d=Math.pow(b,2);
        System.out.println((long)c+(long)d);
    }
}
