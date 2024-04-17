package az.edu.turing.MyProjects;
import java.util.ArrayList;
public class Lists {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Farid");
        System.out.println(strings);
        strings.addLast("necesen");
        System.out.println(strings);
        strings.addFirst("Salam");
        System.out.println(strings);
        strings.add(2, "Hajiyev");
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(strings.get(1));
        strings.remove(2);
        System.out.println(strings);
        strings.remove("necesen");
        System.out.println(strings);

    }
}
