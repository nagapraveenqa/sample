package interview;

import org.testng.annotations.Test;

public class Java05ReverseNumber {
    @Test
    public void reverseNumber()
    {
        int a = 3745;
        int b = 0;
        while(a != 0)
        {
            b = b * 10 + (a%10) ;
            a = a/10;
        }

        System.out.println(b);
    }
}

