package interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java06ExtractandSum {
    public static void main(String[] args) {
        String str = "Testpassed50Testfailed25Testskipped100";
        int sum = 0;

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(str);

        while(m.find())
        {
            sum += Integer.parseInt(m.group());
        }

        System.out.println("Sum is : " + sum);
    }
}

