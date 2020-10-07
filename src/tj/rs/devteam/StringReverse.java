package tj.rs.devteam;

/**
 * @author Rustam Safarov(RS)
 * created at 07.10.2020
 */
public class StringReverse {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        String A="madam";
        /* Enter your code here. Print output to STDOUT. */

        String B ="";

        for (int  i = A.length()-1; i>=0; i--){
            B = B + A.substring(i,i+1);
        }
        if (A.equals(B)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
