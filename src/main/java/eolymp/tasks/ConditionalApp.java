package eolymp.tasks;

import java.util.Scanner;

public class ConditionalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result;
        if (a < 5) {
            result = a * a - 3 * a + 4;
            System.out.println(result);
        } else if (a >= 5) {
            result = a + 7;
            System.out.println(result);
        }
        input.close();
    }
}
