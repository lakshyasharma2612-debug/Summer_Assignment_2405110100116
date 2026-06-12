package Week_2.Day_5;

public class stringCompression {
     public int compress(char[] chars) {
        StringBuilder s= new StringBuilder();
        int st=0,e=0;
        int l= chars.length;
        while(e<l)
        {
            if(chars[st]!=chars[e])
            {
                s.append(String.valueOf(chars[st]));
                if(e-st!=1)
                {
                    s.append(Integer.toString(e-st));
                }
                st=e;
            }
            e++;
        }
        
                s.append(String.valueOf(chars[st]));
                if(e-st!=1)
                {
                    s.append(Integer.toString(e-st));
                }
               

        String str = s.toString();
        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt(i);        
        }
        return str.length();
    }
}
