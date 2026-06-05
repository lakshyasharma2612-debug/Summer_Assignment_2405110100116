package Week_1.Day_5;

public class validPalindrome {
        public boolean isPalindrome(String s) {
        int l=0;
        String x = s.toLowerCase();
        String c = x.replaceAll("[^a-z0-9]", "");
        int r=c.length()-1;
        while(l<r)
        {
            char a = c.charAt(l);
            char b =  c.charAt(r);
            if(a!=b)
            {
                return false;
            }
            ++l;
            --r;
        }
        return true;
    }
}
