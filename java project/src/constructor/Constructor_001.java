package constructor;

public class Constructor_001 {
	//user defined constructor
	private Constructor_001() {
		System.out.println("user defined constructor");
	}

	public static void main(String[] args) {
		Constructor_001 cl = new Constructor_001();
		Constructor_001 c2 = new Constructor_001();

	}

}
