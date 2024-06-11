package oops_concept_polymorphism;

public class child_class_001 extends parent_class_001 {
	public void go (String s) {
		System.out.println("s()method form child class with string void");
	}
	public void get () {
		System.out.println("get() method form child class");
	}

	public static void main(String[] args) {
		 child_class_001 c = new 	child_class_001();
		 c.go("ab");
// has a relationship
parent_class_001 p = new parent_class_001();		 
		 p.get();
		 parent_class_001 c1 = new child_class_001();
		 c1.get();
		
		 
		 
		 
		 
		 

	}

}
