package Week_2.Day_4;

import java.util.ArrayList;
import java.util.List;

public class paranthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        rec(n, n, "", result);
        return result;
    }

    private static void rec(int open, int close, String p, List<String> result) {
        
        if (open == 0 && close == 0) {
            result.add(p);
            return;
        }

        if (open > 0) {
            rec(open - 1, close, p + "(", result);
        }

        if (close > open) {
            rec(open, close - 1, p + ")", result);
        }
    }
}
