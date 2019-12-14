package interview;

import org.testng.annotations.Test;

public class Java11ConvertToCamelCase2 {
    @Test
    public void convertToCamelCase2()
    {
        String str = "make selEnium Easy.";
        StringBuffer sb = new StringBuffer();

        String[] strArray = str.split("\\s+");
        for(String s : strArray)
        {
            if(Character.isUpperCase(s.charAt(0))){
                sb.append(s);
            }
            else if(Character.isLowerCase(s.charAt(0)))
            {
                sb.append(s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0))));
            }

            sb.append(" ");
        }

        System.out.println("New String : " + sb);
    }
}
