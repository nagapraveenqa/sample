package interview;

import org.testng.annotations.Test;

public class Java09CountOfEachCharInString2 {
    @Test
    public void countOfEachCharInString2()
    {
        String str = "Raj is jaRmmmmsssssssss";

        while( str.length() > 1)
        {
            int counter=0;
            char currentChar = str.charAt(0);
            for(int i=0; i<str.length(); i++)
            {
                if(currentChar == str.charAt(i))
                    counter++;
            }
            if(Character.isSpaceChar(currentChar))
            {
                System.out.println( "Whitespace is found : " + counter + " times");
            }
            else
            {
                System.out.println( currentChar + " is found : " + counter + " times");
            }

            str = str.replaceAll(Character.toString(currentChar), "");
        }
    }
}
