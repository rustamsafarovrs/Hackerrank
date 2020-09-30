package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */
public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));
    }
}
