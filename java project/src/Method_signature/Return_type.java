
package Method_signature;

public class Return_type {
	public void get () {
		System.out.println("get method");
		return;
		
	}
	// 4. with return type and parameter
	public int get(int i) {
		System.out.println("get method");
		return i;
	}
	public int get_data(int o) {
		System.out.println("get method with parameter");
		return 10;
	}
	public static String print(String name) {
		System.out.println("your name is:-"+ name);
		return name;
	}

	public static void main(String[] args) {
		print("niku");
		Return_type c1 = new Return_type();
		c1.get_data(9);
		c1.get(1);
		c1.get();
	}

}
