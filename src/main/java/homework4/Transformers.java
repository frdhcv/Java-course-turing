package homework4;

    import java.util.Scanner;

    public class Transformers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = 0;
            while (a > 1) {
                if (a % 2 != 0) {
                    a = a + 1;
                    b++;
                } else {
                    a = a / 2;
                    b++;
                }
            }
            System.out.println(b);
        }
    }
