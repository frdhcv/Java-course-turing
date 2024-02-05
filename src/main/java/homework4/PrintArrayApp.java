package homework4;

import java.util.Scanner;

public class PrintArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.println(b[i]);
        }
    }
}
