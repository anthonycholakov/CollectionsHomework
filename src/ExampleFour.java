import java.util.ArrayList;
import java.util.*;

public class ExampleFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();


        System.out.println("Please add number and see if the collection is mirroring");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                scanner.close();
                break;
            }

            try {
                int val = Integer.parseInt(line);
                list.add(val);
            } catch (NumberFormatException e) {
                System.err.println("Please enter a number or type exit.");
            }
        }
        ArrayList<Integer> reverse = new ArrayList<Integer>(list);
        Collections.reverse(list);

        System.out.println(reverse +"   "+ "comparing it with"+"   "+ list);
        if(list.equals(reverse)) {
            System.out.println("The list is mirroring");
        } else {
            System.out.println("The list is not mirroring");
        }
        }


}

