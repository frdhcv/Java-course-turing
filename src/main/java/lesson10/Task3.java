package lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.length());
        System.out.println(a.indexOf("s"));
        System.out.println(a.trim());
        System.out.println(a.substring(5));
        System.out.println(a.substring(5,10));
    }
}
