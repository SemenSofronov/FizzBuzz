package FizzBuzz;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input n");
        int n = scanner.nextInt();

        method1(n);
//        method2(n);
//        method3(n);
//        method4(n);
    }

    private static void method4(int n) {
        int[] array = new int[n];
        Arrays.setAll(array, j -> j++);
        Arrays.stream(array).forEach(i -> {
            if (i == 0) return;
            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            if (output.equals("")) output += i;
            System.out.println(output);
        });

    }

    private static void method3(int n) {
        System.out.println(rec(n));
    }

    private static String rec(int n) {
        String s = "";
        if (n == 0)
            return s;
        if (n % 5 == 0)
            s = "Buzz" + s;
        if (n % 3 == 0)
            s = "Fizz" + s;
        if (s.equals(""))
            s = n + "";
        s += "\n";
        return rec(n - 1) + s;
    }

    private static void method2(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ? String.valueOf(i) : "Fizz" : "Buzz" : "FizzBuzz");
        }
    }

    private static void method1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 5 != 0 && i % 3 != 0) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
