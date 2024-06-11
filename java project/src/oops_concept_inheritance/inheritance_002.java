package oops_concept_inheritance;
// is_A relationship

public class inheritance_002 extends Inheritance_001 {
			double e = 23.45;
	static long s = 80000;
	public void b() {
		System.out.println("b method");
	}

	public static void main(String[] args) {
		inheritance_002 cb = new inheritance_002();
		System.out.println(cb.i);//class a
		cb.get_data();// class_a
		System.out.println(cb.e);
		
		System.out.println(s);
		
		
		
		
		
	}

}
