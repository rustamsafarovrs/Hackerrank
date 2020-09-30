package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */
public class StringsIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        String comp = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(comp);
        String up = A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(up);
    }
}
