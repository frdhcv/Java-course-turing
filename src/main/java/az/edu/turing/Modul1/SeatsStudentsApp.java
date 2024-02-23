package az.edu.turing.Modul1;

public class SeatsStudentsApp {
    public static void main(String[] args) {
        String[] students = populate();
        int[] seats = new int[17];
        int size = students.length;
        for (int i = 0; i < size; i++) {
            seats[i] = i;
        }
        for (int i = 0; i < size; i++) {
            int n = (int) (Math.random() * 17);
            int temp = seats[n];
            seats[n] = seats[i];
            seats[i] = temp;

        }
        print(students, seats);

    }

    private static String[] populate() {
        return new String[]{
                "Aybəniz",
                "Aydan",
                "Bəhruz",
                "Bəşir",
                "Eldar",
                "Fərid.H",
                "Fərid.K",
                "Kənan",
                "Leyla",
                "Nurlan",
                "Nəzrin",
                "Selen",
                "Taleh",
                "Vüsal",
                "Ilham",
                "Ismayıl",
                "Əli"
        };
    }

    public static void print(String[] students, int[] seats) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + "->" + seats[i]);

        }
    }
}

