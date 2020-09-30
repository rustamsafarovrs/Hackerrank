package tj.rs.devteam;

import java.util.Scanner;

/**
 * @author Rustam Safarov(RS)
 * created at 30.09.2020
 */

class Parser {
    public boolean isBalanced(String s) {
        java.util.Stack<String> stack = new java.util.Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.substring(i, i + 1));
            } else {
                String peek = stack.peek();
                if (peek.equals("(") && s.substring(i, i + 1).equals(")")) {
                    stack.pop();
                } else if (peek.equals("{") && s.substring(i, i + 1).equals("}")) {
                    stack.pop();
                } else {
                    stack.push(s.substring(i, i + 1));
                }
            }
        }
        return stack.isEmpty();
    }
}

public class Stack {
    public static void main(String[] args) {
        Parser parser = new Parser();

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            System.out.println(parser.isBalanced(in.next()));
        }

        in.close();
    }
}
