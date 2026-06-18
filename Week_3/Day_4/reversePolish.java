package Week_3.Day_4;

import java.util.Stack;

public class reversePolish {
     public int evalRPN(String[] tokens) {

        Stack<String> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            if ((token.equals("+") || token.equals("-") || token.equals("*") || 
                 token.equals("/")) && st.size() >= 2) {

                Integer num2 = Integer.valueOf(st.pop());
                Integer num1 = Integer.valueOf(st.pop());

                ans = calculate(num1, num2, token.charAt(0));

                st.push(String.valueOf(ans));
                continue;
            }

            st.push(token);
        }

        return Integer.parseInt(st.pop());
    }

    public static int calculate(Integer num1, Integer num2, char operator) {

        switch (operator) {

            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;

            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
