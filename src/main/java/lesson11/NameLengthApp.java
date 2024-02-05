package lesson11;

import java.util.Scanner;

public class NameLengthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println(extracteName(a));
        System.out.println(lengthOfName(extracteName(a)));
    }
    public static String extracteName(String name) {
        return name.substring(0, name.indexOf("@"));
    }
    public static int lengthOfName(String namelength) {
        return namelength.length();
    }
}