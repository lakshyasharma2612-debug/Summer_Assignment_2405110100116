package Week_2.Day_3;

public class repeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        int n =s.length();
        for(int i=1;i<=n/2;i++)
        {
            String a =s.substring(0,i);
            StringBuilder sb =new StringBuilder();
            int t= n/i;
            for(int j=0;j<t;j++)
            {
                sb.append(a);
            }
            if(sb.toString().equals(s))return true;
        }
        return false;
    }
}
