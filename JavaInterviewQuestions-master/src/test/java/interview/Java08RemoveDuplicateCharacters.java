package interview;

import org.testng.annotations.Test;

public class Java08RemoveDuplicateCharacters {
    @Test
    public void removeDuplicateChars()
    {
        String str = "zomabasdadasd";
        StringBuffer newStr = new StringBuffer();
        int i=0;
        while(i<str.length())
        {
            String c = str.substring(i, i+1);
            if(newStr.indexOf(c) == -1)
                newStr.append(c);
            i++;
        }
    }
}
