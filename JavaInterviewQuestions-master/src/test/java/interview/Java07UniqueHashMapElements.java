package interview;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Java07UniqueHashMapElements {
    @Test
    public void uniqueHashMapValues()
    {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        hm.put(1, 100);
        hm.put(2, 200);
        hm.put(3, 100);
        hm.put(4, 400);
        hm.put(5, 200);

        System.out.println("Original Map : " + hm);
        HashSet<Integer> hs = new HashSet<Integer>();
        Set<Integer> keySet = hm.keySet();

        for(Integer i: keySet)
            hs.add(hm.get(i));

        System.out.println("Unique Values : " + hs);

    }
}
