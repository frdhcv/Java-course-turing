package homework4;

import java.util.Scanner;

public class Rectangle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
