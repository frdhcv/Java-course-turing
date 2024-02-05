package Lesson04;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class area {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //formula area=Math.PI*radius*radius
        System.out.println("Enter radius of circle");
        double radius=input.nextDouble();
        System.out.println("The" + " area" +" of" +" the" + " circle" +" is " +Math.PI*radius*radius +" CM");


    }
}