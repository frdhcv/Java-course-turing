package homework4;

import java.util.Scanner;

public class ValOfVar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a= scanner.nextInt();
        double p1=(2*a-1)/Math.pow(a,2);
        double p2=Math.sqrt(Math.pow(a,2)+1)/2;
        double res=p1+p2;
        System.out.printf("%.3f",res);
    }
}