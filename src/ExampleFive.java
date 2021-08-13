import java.util.ArrayList;
import java.util.Scanner;

public class ExampleFive {
    public static void main(String[] args) {

        ArrayList<Integer> fibonacciSeries = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of fibonacci series you want:");
        int length = 10;
        fibonacciSeries.add(1);
        fibonacciSeries.add(sc.nextInt());
        sc.close();


            for (int i = 3; i <= length; i++) {
                fibonacciSeries.add(fibonacciSeries.get(i - 2) + fibonacciSeries.get(i - 3));
            }

            System.out.println("Fibonacci series of length " + length + " is below:");
            System.out.println(fibonacciSeries);
        }
    }




