package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */


abstract class Calculator {
    abstract int add(int a, int b);
}

class Adder extends Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }
}

public class Solution {
    public static void main(String[] args) {

        Calculator adderObject = new Adder();
        short s=9;
        System.out.println("The sum is: " + adderObject.add(s, 6));
    }
}
