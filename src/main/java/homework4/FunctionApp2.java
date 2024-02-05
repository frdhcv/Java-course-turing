package homework4;

import java.util.Scanner;

public class FunctionApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        long res=1+a+(long)a*a;
        System.out.println(res);
    }
}
