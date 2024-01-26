package eolymp.tasks;

import java.util.Scanner;

public class FirstOrLastApp {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int a=input.nextInt();
            int b=a/100;
            int c=a%10;
            if(c>b){
                System.out.println(c);
            }else if(b>c){
                System.out.println(b);
            }else System.out.println("=");
            input.close();
    }
}