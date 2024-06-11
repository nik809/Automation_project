package variables;

public class Static_variables {
//static variable
	static String s ="Automation";
	static String d = "class";
	
	
	
	public static void main(String[] args) {
//	directly Access variable static variable
		System.out.println(s);
		System.out.println(d);

//		Access by class name 
		System.out.println(Static_variables.s);
		System.out.println(Static_variables.d);
//		Access by class object
		Static_variables n = new Static_variables();
		Static_variables m = new Static_variables();
		System.out.println(n.s);
		System.out.println(m.d);
	
		

	}

}
