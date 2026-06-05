package Week_1.Day_5;

public class CommonPrefix {
     public String longestCommonPrefix(String[] strs) {
       
        int i;
        for(i=0;i<strs[0].length();i++)
        {   
            int k=0;
            while(k<strs.length)
            {   if(i>=strs[k].length())return strs[0].substring(0,i);;
                if(strs[0].charAt(i)!=strs[k].charAt(i))return strs[0].substring(0,i);;
                k++;
            }
            
        }
        return strs[0];
    }
}
