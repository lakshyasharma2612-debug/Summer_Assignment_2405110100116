package Week_3.Day_3;

import java.util.Stack;

public class validPara {
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (c == ')') {
                    if ( st.isEmpty()||st.pop() != '(' ) {
                        return false;
                    }
                }
                if (c == '}') {
                    if ( st.isEmpty()||st.pop() != '{' ) {
                        return false;
                    }
                }
                if (c == ']') {
                    if ( st.isEmpty()||st.pop() != '[' ) {
                        return false;
                    }
                }
            }

        }
        return st.isEmpty();

    }
}
