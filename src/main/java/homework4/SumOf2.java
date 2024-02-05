package homework4;

import java.util.Scanner;

public class SumOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (int i = 0; i < s; i++) {

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}
