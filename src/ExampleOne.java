
import java.util.Locale;
import java.util.Scanner;

public class ExampleOne {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";

        System.out.println("Enter a word: ");
        word = scanner.nextLine();

        uniqueCharacters(word);
    }

    public static void uniqueCharacters(String test) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < test.length(); i++) {
            if (temp.toString().indexOf(test.charAt(i)) == -1) {
                temp.append(test.charAt(i));
            }
        }

        System.out.println(temp + " ");

    }
}