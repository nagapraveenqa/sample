package interview;

import org.testng.annotations.Test;

public class Java10FindOccurance {
    @Test
    public void findOccurance()
    {
        String str = "Raj is jjjjjjjaR";
        char c = 'j';

        int initialLength = str.length();
        int newLength = str.replaceAll(Character.toString(c), "").length();

        System.out.println(c + " occured : " + (initialLength-newLength) + " times.");

    }
}
