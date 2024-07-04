import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * If N is odd, print Weird
 * If N is even and in the inclusive range of  to , print Not Weird
 * If N is even and in the inclusive range of  to , print Weird
 * If N is even and greater than , print Not Weird
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Informe um número");
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        checkNCondition(N);

       // bufferedReader.close();
    }

    private static void checkNCondition(Integer N){
        if (N % 2 != 0){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N <= 5 && N >= 2 ){
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && N <= 20 && N >= 6 ){
            System.out.println("Weird");
        } else if (N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        }
    }
}
