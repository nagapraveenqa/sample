package date_24_7_19;

import java.util.HashMap;

public class count_the_duplicates {
public static void main(String[] args) {
	String str="salmankhan";
	char[] ch=str.toCharArray();
	HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
	for(char c:ch){
		if(hm.containsKey(c)){
			hm.put(c, hm.get(c)+1);
		}else {
			hm.put(c, 1);
		}
	}System.out.println(hm);
}
}
