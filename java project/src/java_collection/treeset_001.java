package java_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset_001 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		// add value
		ts.add(10);ts.add(20);ts.add(30);ts.add(40);
		ts.add(50);ts.add(60);ts.add(70);ts.add(80);
		// to print all value
		System.out.println(ts);
		// to remove
		
		
		// to remove all value
		ts.clear();
		System.out.println(ts);
		// to check specific value
		ts.contains(30);
		System.out.println(ts.contains(30));
		// create Duplicate value
		System.out.println(ts.clone());
		// 
		Iterator<Integer>it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}
}
