package variables;

public class Local_variable {
//	Instance method
	public void verify () {
		int i = 20;
		int n = 30;
		
		System.out.println(i);
		System.out.println(n);
	}

	public static void main(String[] args) {
//local variable
		long l =12345;
		long r = 67890;
		
		System.out.println(l);
		System.out.println(r);
		
		Local_variable y = new Local_variable ();
		Local_variable x = new  Local_variable ();
		
		y.verify();
		x.verify();
		
	}

}
