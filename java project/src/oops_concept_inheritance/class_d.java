package oops_concept_inheritance;

public class class_d  extends class_c{
	public void y () {
		System.out.println("y method");
	}

	public static void main(String[] args) {
// has_A Relationship
		class_c c = new class_c();
		c.go();
		c.print();
		// parent class ref Relationship
		class_c c1 = new class_d();
		c1.print();
		go();
		// property-4
	//	class_d c2 = new class_c();
		
	}

}
