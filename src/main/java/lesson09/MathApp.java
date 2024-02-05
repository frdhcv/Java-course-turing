package lesson09;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("Perimeter of square is: " + 4 * a);
        System.out.println("Area of square is: " + Math.pow(a, 2));
        System.out.println("Length of circle is: " + Math.PI * Math.pow(a, 2));
        System.out.println("Area of the circle is :" + Math.PI * Math.pow(a, 2));
    }
}
