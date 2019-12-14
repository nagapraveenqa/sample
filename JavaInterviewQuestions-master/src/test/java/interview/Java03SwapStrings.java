package interview;

import org.testng.annotations.Test;

public class Java03SwapStrings {
    @Test
    public void swapStrings()
    {
        String str1 = "Java";
        String str2 = "Python";

        System.out.println("Before swap :");
        System.out.println(" a : " + str1);
        System.out.println(" b : " + str2);

        // concat the strings
        str1  = str1 + str2;

        // get str2
        str2 = str1.substring(0, str1.length()-str2.length());

        // get str1
        str1 = str1.substring(str2.length());

        System.out.println("After swap :");
        System.out.println(" a : " + str1);
        System.out.println(" b : " + str2);


    }
}

