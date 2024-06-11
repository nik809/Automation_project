package java_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map_hash_001 {

	public static void main(String[] args) {
HashMap<Integer, String> hm = new HashMap<Integer, String>();
	// add value 
	hm.put(0,"ab" );
	hm.put(1, "cd");
	hm.put(5, "ef");
	hm.put(6, "gh");
	hm.put(7, "ij");
	hm.put(0, "kl");
	// to print value 
	System.out.println(hm);
	// to remove value
	hm.remove(7);
	System.out.println(hm);
	hm.remove(5, "ef");
	System.out.println(hm);
	// to replace one value
	hm.replace(1, "xy");
	hm.replace(5, "ef", "st");
	System.out.println(hm);
	// to get value with respect 
	
	System.out.println
	(hm.get(6));
// to get size 
	System.out.println(hm.size());
	// to search any key
	System.out.println(hm.containsKey(1));
	// to search any value
	System.out.println(hm.containsValue("ab"));
	// create
	System.out.println(hm.clone());
	// to remove all value 
	hm.clear();
	System.out.println(hm);
	// to print all value using iteratore
	// convert hashmap to set
	Set<Entry<Integer, String>> s = hm.entrySet();
	Iterator<Entry<Integer, String>>it=s.iterator();
	while (it.hasNext()) {
Map.Entry m = (map.Entry)it.next();

	}
	

	}
}