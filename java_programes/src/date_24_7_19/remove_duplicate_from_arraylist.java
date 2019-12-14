package date_24_7_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove_duplicate_from_arraylist {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>(
			Arrays.asList(1,2,3,3,40,40,4,5,6,6,77,777,8,8));
	System.out.println("arraylist with duplicate :"+list);
	
	List<Integer> listnew=list.stream().distinct().collect(Collectors.toList());
	
	System.out.println("Arrayslist with duplicate removed :"+listnew);
}
}
