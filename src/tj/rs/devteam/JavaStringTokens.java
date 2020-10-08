package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 08.10.2020
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.

        String[] t = s.split("[!,?._'@\\s]+");
        System.out.println(t.length);
        for (String value : t) {
            System.out.println(value);
        }

        scan.close();
    }
}
