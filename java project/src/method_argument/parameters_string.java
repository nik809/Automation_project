package method_argument;

public class parameters_string {
	String s ;
	long l ;
	int m;
	long a;
	
	public void assignvalue (String ab, long k,int nd) {
		s = ab;
		l = k;
		m = nd;
		
		System.out.println(s);
		System.out.println(l); 
		System.out.println(m);
		System.out.println(a);
	}

	public static void main(String[] args) {
		parameters_string p = new parameters_string ();
		p.assignvalue("automation", 67850, 678);
		p.assignvalue("class", 70, 200);
		
	}

}
