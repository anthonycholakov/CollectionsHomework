import java.util.*;

public class ExampleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";

        while (sc.hasNext()) {
            String s = sc.nextLine();
            if (s.contentEquals("END OF TEXT")) {
                break;
            } else {
                line += s;
            }
        }

        System.out.println(line);

    }
}