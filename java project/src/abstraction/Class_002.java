package abstraction;


public  class Class_002 extends Class_001 {
	@Override
	public void cd() {
		System.out.println("cd()from class_002");
		
	}

	@Override
	public void ef() {
		System.out.println("ef()from class_002");
	}
		
		public static void main(String[] args) {
			Class_002 c = new Class_002();
			c.cd();
			c.ef();
			c.xy();
			c.op();

	}

	

}
