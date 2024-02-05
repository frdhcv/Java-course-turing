package lesson05;

public class Casting {
    public static void main(String[] args) {
        byte b1=4;
        byte b2=(byte)129;
        int i1=b2;
        int i2=130;
        byte b3=(byte)i2 ;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
