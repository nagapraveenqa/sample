package date_24_7_19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicate_from_given_string {
static String str="salmankhan";
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Set<Character> linkedHashSet=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++)
		{
			linkedHashSet.add(str.charAt(i));
		}
		
		for(char ch:linkedHashSet){
			sb.append(ch);
			System.out.print(ch);

					}
		
		
		
	}
	
	
}
