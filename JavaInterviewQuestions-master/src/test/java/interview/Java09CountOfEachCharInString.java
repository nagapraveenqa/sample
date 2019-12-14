package interview;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java09CountOfEachCharInString {
    @Test
    public void countOfEachCharInString()
    {
        String str = "Raj is GraijassaaaGGGGGG";
        char[] chars = FindUniqueChars(str).toCharArray();

        for(char c : chars)
        {
            int count =0;
            Pattern p = Pattern.compile(Character.toString(c));
            Matcher m = p.matcher(str);
            while(m.find())
            {
                count++;
            }
            System.out.println(c + " is found : " + count + " times in the string : " + str);
        }


    }

    public String FindUniqueChars(String origString)
    {
        StringBuffer newStr = new StringBuffer();
        int i=0;
        while(i<origString.length())
        {
            String c = origString.substring(i, i+1);
            if(newStr.indexOf(c) == -1)
                newStr.append(c);
            i++;
        }

        return newStr.toString();
    }
}
