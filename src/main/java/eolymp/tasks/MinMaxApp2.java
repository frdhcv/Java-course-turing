package eolymp.tasks;

import java.util.Scanner;
public class MinMaxApp2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));

        input.close();
    }
}
