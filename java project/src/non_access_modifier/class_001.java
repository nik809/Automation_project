package non_access_modifier;

public  class class_001 {
	//static block
	static {
		System.out.println("static block");
		
	}
	public final static void m1() {
		System.out.println("m1 method");
		
	}
	final public void m2 (){
	
	}
	

	public static void main(String[] args) {
		 class_001 c = new class_001();
			c.m1();
		 }
	}


