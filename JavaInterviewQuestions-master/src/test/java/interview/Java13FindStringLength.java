package interview;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java13FindStringLength {
    @Test
    public void findStringLength()
    {
        String str = "Raj is great";

        // Method 1 : use char array
        char[] charsArray = str.toCharArray();
        System.out.println(charsArray.length);

        // Method 2 :  Using Regex
        int count=0;
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            count++;
        }

        System.out.println(count);

        // Method 3 : Using lastIndexOf
        int lastIndex = str.lastIndexOf("");
        System.out.println(lastIndex);
    }
}
