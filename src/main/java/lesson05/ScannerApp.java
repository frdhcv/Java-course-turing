package lesson05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of month");
        int a= input.nextInt();
        System.out.printf(a>0&&a<4?  "Winter":a>3&&a<7? "Spring":a>6&&a<10?"Summer":a>9&&a<13?"Fall":"false");
    }
}
