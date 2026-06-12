package Week_2.Day_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class anagramGroup {
     public List<List<String>> groupAnagrams(String[] strs) {
       int l= strs.length;
       Map<String,List<String>> map = new HashMap<>();
       for(int i=0;i<l;i++)
       {
        String str = strs[i];
        char []ch=str.toCharArray();
        Arrays.sort(ch) ;
        String s= new String(ch); 
        map.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
       }
       List<List<String>> ans= new ArrayList<>();
       List<String>st= new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
}
}
