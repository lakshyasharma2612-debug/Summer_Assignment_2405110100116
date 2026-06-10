package Week_2.Day_3;

public class subsequence {
     public boolean isSubsequence(String s, String t) {
        int a= sub(0,0,s,t);
        if(a==s.length())
        {
            return true;
        }
        else{
        return false;
        }
    }
    private static int sub (int i,int j,String s, String t)
    {
        if(j==t.length()||i==s.length())
        {
            return i;
        }
        
        if(s.charAt(i)==t.charAt(j))
        {
            return sub(i+1,j+1,s,t);
        }
        else
        {
             return sub(i,j+1,s,t);
        }

    }
}
