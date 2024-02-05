package homework4;

import java.util.Scanner;

public class FunctionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b=scanner.nextInt();
        int c= scanner.nextInt();
        long res;
        res = (long) a *b*c+a+ (long) b *b+ (long) c *c*c;
        System.out.println(res);
    }
}
