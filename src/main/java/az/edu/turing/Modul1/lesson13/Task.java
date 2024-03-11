package az.edu.turing.Modul1.lesson13;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1= scanner.next();
        String n2= scanner.next();
        int a1=Integer.parseInt(n1);
        int a2=Integer.parseInt(n2);
        System.out.println(a1/a2);
    }
}
