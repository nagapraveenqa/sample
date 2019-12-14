package interview;

import org.testng.annotations.Test;

public class Java04SwapTwoNumbers {
    @Test
    public void swapNumbers()
    {
        int a = 100;
        int b = 200;

        System.out.println("Before Swap : ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap : ");
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);

    }
}

