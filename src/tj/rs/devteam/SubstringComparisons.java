package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 07.10.2020
 */
public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String[] sb = new String[s.length() - k + 1];

        for (int i = 0; i <= s.length() - k; i++) {
            sb[i] = s.substring(i,i+k);
        }

        for (int i = 0; i<sb.length; i++){
            for (int j = i+1; j<sb.length; j++){
                if (sb[i].compareTo(sb[j])>0){
                    String tmp = sb[i];
                    sb[i]=sb[j];
                    sb[j] = tmp;
                }
            }
        }

        smallest = sb[0];
        largest = sb[sb.length-1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        String s = "welcometojava";
        int k = 3;
//        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
