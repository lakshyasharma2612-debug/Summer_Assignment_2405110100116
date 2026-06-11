package Week_2.Day_4;

public class revWords {
     public String reverseWords(String s) {
      
        String ans= check(0,1,s,"");
        return ans;
    }
     public static String check(int i,int j,String s,String ans )
     {  
       
       boolean flag=false;
        if(j>s.length())
        {
            return ans;
        }
        if(j<s.length())
        {
         char ch = s.charAt(j);
         flag=Character.isWhitespace(ch);
        }
        if(flag||j==s.length())
        {
            String original = s.substring(i,j);
            String rev = new StringBuilder(original).reverse().toString();
            if(j==s.length())ans= ans + rev;
            else ans= ans + rev+ " ";
            return check(j+1,++j,s,ans); 
        }
        return check(i,++j,s,ans);

     }
}
