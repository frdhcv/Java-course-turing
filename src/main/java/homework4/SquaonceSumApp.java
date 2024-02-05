package homework4;

import java.util.Scanner;

public class SquaonceSumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int j : arr) {
            if (j >= 0) {
                System.out.print(j + 2);
            } else System.out.print(j);
        }
    }
}
