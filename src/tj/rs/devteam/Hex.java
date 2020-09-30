package tj.rs.devteam;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */
public class Hex {
    public static void main(String[] args) {
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value&mask);
    }
}
