package eolymp.tasks;

import java.util.Scanner;

public class ConditionalApp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long result;
        if (a < 10) {
            result = a * a - 2 * a + 4;
            System.out.println(result);
        } else if (a >= 10) {
            result = a * a * a + 5 * a;
            System.out.println(result);
        }
        input.close();
    }
}
