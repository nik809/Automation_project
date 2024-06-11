package java_collection;

import java.util.ArrayList;

public class array_list_001 {

	public static void main(String[] args) {
ArrayList<String> name = new ArrayList<String>();
//add value
name.add("Ashwini_1");
name.add("vaibhav");
name.add("nikhita");
name.add("shruti");
name.add("akansha");
name.add("abhinav");
name.add("rahul");
name.add("aakash");
name.add("vaishnavi");
name.add("Ashwini_2");
name.add("Ashwini_3");
name.add(" null");
name.add("nikhita");
name.add("abc");
// add value with index
name.add(12, "def");
name.add(11, "ijk");
//name.add(20, "ab");// exception come order follo krte



// to print value
System.out.println(name);
// print value with respect to index 
System.out.println(name.get(0));
// remove value 
//name.remove(13);
//System.out.println(name);
// to remove all value
name.clear();
System.out.println(name);

// to check specific value
System.out.println(name.contains("poonam"));
System.out.println(name.contains("shruti"));
//to get index 
System.out.println(name.indexOf("shruti"));
// to get size 
System.out.println(name.size());
// create copy
System.out.println(name.clone());
	}

}
