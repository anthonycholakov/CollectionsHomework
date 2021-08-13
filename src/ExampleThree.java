
import java.util.*;

public class ExampleThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<String> strings = new ArrayList<>();
       while(sc.hasNext()) {
           strings.add(sc.nextLine());
           if (strings.contains("END TO TEXT")){
              strings.remove(strings.size()-1);
               break;
           }
       }
        int reverseArrayListCounter = strings.size() - 1;

        for (int i = reverseArrayListCounter; i >= 0; i--) {
            System.out.println(strings.get(i));
        }

    }
}