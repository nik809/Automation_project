package super_keyword;

public class class_002 extends class_001{
public double d = 2.001;
// super keyword
public void get_variable() {
	//variable from parent class
	System.out.println(super.f);
}

	public static void main(String[] args) {
		class_002 s = new class_002();
s.get_variable();	}

}
