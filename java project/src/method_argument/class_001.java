package method_argument;

public class class_001 {
	int a ;
	int b ;
	int c;
	
	public void x (int n) {
		a = n;
		
	}
	public void y (int m) {
		b = m ;
			
		}
	public void z (int o) {
		c = o;
	
		}
		
		
	
	public void print_value() {
		System.out.println("the value of instance variable a is :-" +a);
		System.out.println("the value of instance variable b is :-"+b);
		System.out.println("the value of instance variable c is :-"+c);
	}


				
		
	public static void main(String[] args) {
		class_001 c1 = new class_001();
		c1.x(25);
		c1.y(50);
		c1.z(60);
		c1.print_value();
	}

	}


