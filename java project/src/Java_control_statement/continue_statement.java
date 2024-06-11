package Java_control_statement;

public class continue_statement {

	public static void main(String[] args) {
		for(int i=10; i<=15; i++) {
			if(i==11) {
				continue;
			}
			System.out.println(i);
		}
	}

}
