package interview;

import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java02RemoveSpecialJunkCharacters {
    @Test
    public void RemoveJunkCharacters()
    {
        String str = "Abc%23#8,Ssd.";

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
//        dont use loop like below
//        Pattern p = Pattern.compile("[a-zA-Z0-9]");
//        Matcher m = p.matcher(str);
//        while(m.find())
//        {
//            System.out.print(m.group());
//        }
    }
}