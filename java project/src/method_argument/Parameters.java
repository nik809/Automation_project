package method_argument;

public class Parameters {
// Instance variable 
	int i;
	int s;
	int x;
	int y;
//	Instance method
	public void assign_value (int a ,int b) {
//		Assign value to instance variable
		i = a;
		s = b;
		x = a;
		y = b;
		System.out.println(i);
		System.out.println(s);
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		Parameters p = new 	Parameters ();
				p.assign_value(24,59);
				p.assign_value(30, 50);
				
		
		
		
		

	}

}
