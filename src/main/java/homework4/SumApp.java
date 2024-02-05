package homework4;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        double sum=0;
        for (int i = 0; i <n ; i++) {
            double num= scanner.nextDouble();
            sum+=num;
        }
            System.out.println(sum);
    }
}
