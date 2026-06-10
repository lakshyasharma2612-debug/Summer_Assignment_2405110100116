package Week_2.Day_1;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())return false;
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        Arrays.sort(sCh);
        Arrays.sort(tCh);
        
        return Arrays.equals(sCh, tCh);
    }
}
