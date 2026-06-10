package Week_2.Day_3;

public class firstOccurence {
     public int strStr(String haystack, String needle) {
        int n= needle.length();
        int h= haystack.length();
        for(int i=0;i<h-n+1;i++)
        {
            String sub = haystack.substring(i,i+n);
            if(needle.equals(sub))
            {
                return i;
            }
        }
        return -1;
    }
}
