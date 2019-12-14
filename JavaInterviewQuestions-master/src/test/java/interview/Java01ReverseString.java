package interview;

import org.testng.annotations.Test;

public class Java01ReverseString {
    @Test
    public void ReverseString()
    {
        String str = "Java";

        for(int i = str.length()-1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
    }
}
