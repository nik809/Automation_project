package exception;// customized exception

public class class_005 {
	public void number () {
		int i = 30;
		int r = i/2;
		System.out.println("hii");
		System.out.println(r);
		throw new ArithmeticException("number cant divid by 0");
	}

	public static void main(String[] args) {
		class_005 c = new class_005();
		c.number();
		System.out.println("hii");

	}

}
