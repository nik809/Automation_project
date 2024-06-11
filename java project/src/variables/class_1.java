package variables;

public class class_1 {
//	Instance variable
	byte b = 100;
//	static variable
	static int i =2000;
//Instance method
	public void print () {
		System.out.println(b);
		System.out.println(i);
	}
//	static method
	public static void print_variable () {
//		Access instance variable
		System.out.println();
		
//		Access static variable 
		System.out.println(i);
		}
	public static void main(String[] args) {
	//Access static method directly
	print_variable();
		class_1 s = new  class_1 ();
		s.print();
	}

}
