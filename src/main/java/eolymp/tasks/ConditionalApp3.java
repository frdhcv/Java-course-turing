package eolymp.tasks;

import java.util.Scanner;

public class ConditionalApp3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        if (a < -4) {
            System.out.println(a + 5);
        } else if (a > 7) {
            System.out.println(a * a * a + 2 * a);
        } else if (a > -5 && a < 8) {
            System.out.println(a * a - 3 * a);
        }
        input.close();
    }
}
