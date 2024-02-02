package lesson11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        System.out.println(getName(a));
        System.out.println(Length(getName(a)));

    }
    public static String getName(String name)
    {
        return name.substring(0,name.indexOf("@"));
    }public static int Length(String namelength){
        return namelength.length();
    }
}