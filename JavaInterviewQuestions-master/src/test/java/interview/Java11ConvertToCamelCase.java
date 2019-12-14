package interview;

import org.testng.annotations.Test;

public class Java11ConvertToCamelCase {
    @Test
    public  void convertToCamelCase()
    {
        String str = "make selenium easy.";
        StringBuffer camelString = new StringBuffer();

        char[] chars = str.toCharArray();
        for(int i=0; i<str.length(); i++)
        {
            if(i==0)
            {
                camelString.append(Character.toUpperCase(chars[i]));
            }
            else if(Character.isSpaceChar(chars[i]))
            {
                camelString.append(" ");
                camelString.append(Character.toUpperCase(chars[i+1]));
                i++;
            }
            else
            {
                camelString.append(chars[i]);
            }
        }

        System.out.println(camelString);


    }
}
