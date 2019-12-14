package date_24_7_19;

import java.util.Scanner;

public class isplalindrome {
public static void main(String[] args) {
	String a,b="";
	Scanner s=new Scanner(System.in);
a=s.nextLine();
int n=a.length();    //sas
for (int i = n-1; i >=0; i--) {
	b=b+a.charAt(i);//a=sas  b=sas
}if (a.equalsIgnoreCase(b)) {
	System.out.println("The String is palindrom");
}else {
	System.out.println("The string not palindrom");
}
}
}
