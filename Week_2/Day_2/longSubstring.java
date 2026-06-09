package Week_2.Day_2;

import java.util.HashSet;

public class longSubstring {
 public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        HashSet<Character> chars = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
      return max;       
    }
}
