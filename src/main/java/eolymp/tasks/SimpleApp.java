package eolymp.tasks;

import java.util.Scanner;

public class SimpleApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        String intstring =Integer.toString(a);
        for (int i = 0; i <intstring.length() ; i++) {
            System.out.print(intstring.charAt(i)+" ");
        }
    }
}