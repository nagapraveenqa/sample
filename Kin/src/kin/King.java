package kin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class King {
public static void main(String[] args) {
	List<HashMap<String, String>> list=new ArrayList<HashMap<String,String>>();	
	HashMap<String, String> list0=new HashMap<String, String>();
	list0.put("a", "b");
	list0.put("a", "d");
	list.add(list0);
	HashMap<String, String> list1=new HashMap<String, String>();
	list1.put("e", "b");
	list1.put("f", "d");
	list.add(list0);
	list.add(list1);
	System.out.println(list0);
	System.out.println(list1);
	
	System.out.println(list);
}
}
