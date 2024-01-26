package tj.rs.devteam.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result = Result.viralAdvertising(n);
        System.out.println("result = " + result);
    }
}

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        int liked = 5 / 2;
        int shared = liked * 3;
        int result = liked;
        for (int day = 2; day <= n; day++) {
            shared = liked * 3;
            liked = shared / 2;
            result += liked;
        }
        return result;
    }
}
