package tj.rs.devteam;

import java.util.Locale;
import java.util.Scanner;

class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = Double.parseDouble(scanner.next());
        scanner.close();

        String us= String.format(Locale.US,"$%,.2f", payment);              //US: $12,324.13
        String india= String.format(Locale.ROOT, "Rs.%,.2f", payment);      //India: Rs.12,324.13
        String china = String.format(Locale.CHINA, "￥%,.2f", payment);     //China: ￥12,324.13
        String france = String.format(Locale.FRANCE, "%,.2f €", payment);          //France: 12 324,13 €

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
}

