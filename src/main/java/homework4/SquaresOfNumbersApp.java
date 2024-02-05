package homework4;

import java.util.Scanner;

public class SquaresOfNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 1; i * i <= a; i++) {
            System.out.print(i * i+" ");
        }
    }
}
