import java.util.Scanner;

/**
 * In this challenge, you must read  integers from stdin and
 * then print them to stdout. Each integer must be printed
 * on a new line.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor 1");
        int value1 = scanner.nextInt();

        System.out.println("Valor 2");
        int value2 = scanner.nextInt();

        System.out.println("Valor 3");
        int value3 = scanner.nextInt();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

    }
}
