package Week_2.Day_4;

public class stringDecoder {
     int i = 0;
    public String decodeString(String s) {
        i = 0;
        return decode(s);
    }
    private String decode(String s) {
        StringBuilder res = new StringBuilder();
        int n = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
                i++;
            } else if (c == '[') {
                i++;
                String inner = decode(s);
                for (int k = 0; k < n; k++) res.append(inner);
                n = 0;
            } else if (c == ']') {
                i++;
                return res.toString();
            } else {
                res.append(c);
                i++;
            }
        }
        return res.toString();
    }
}
