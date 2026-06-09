package Week_2;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
     public boolean canConstruct(String ransomNote, String magazine) {
          Map<Character,Integer> m= new HashMap<>();
          for(char c:magazine.toCharArray())
          {
             m.put(c,m.getOrDefault(c,0)+1);
          }
          for (int i=0;i<ransomNote.length();i++)
          {
            char ch= ransomNote.charAt(i);
            if(!m.containsKey(ch)||m.get(ch) <= 0){
                return false;
            }
            m.put(ch, m.get(ch) - 1);
          }
          return true;
    }
}
