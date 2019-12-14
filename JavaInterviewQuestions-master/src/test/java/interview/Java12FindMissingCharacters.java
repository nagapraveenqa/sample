package interview;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Java12FindMissingCharacters {
    @Test
    public void findMissingAlphabets()
    {
        String inputString = "Raj is great bcdefghijklmnopqrstABCDEFGHIJKLMNOP";
        inputString = inputString.replace(" ", "");
        String[] inputStringArray = inputString.split("");
        String[] allCharsArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

        Set<String> inputSet = new HashSet<String>(Arrays.asList(inputStringArray));
        Set<String> allCharsSet = new HashSet<String>(Arrays.asList(allCharsArray));

        System.out.println("User input set is : " + inputSet);
        System.out.println("Alphabets set is : " + allCharsSet);

        // Intersection of above set
        allCharsSet.removeAll(inputSet);

        System.out.println("Missing Alphabets set is : " + allCharsSet);
    }
}
