package tj.rs.devteam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */
public class FizzBuzz {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Result.fizzBuzz(n);

            bufferedReader.close();
        } catch (Exception e) {
        }
    }
}

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && !(i % 5 == 0)) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && !(i % 3 == 0)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
