package exception;

public class class_006 {

	public static void main(String[] args) {
			try {
				//statement 1
				//statement 2
				//statement 3
				Thread.sleep(300);
				
			} catch (Exception e) {
				try {
					Thread.sleep(123);
				} catch (Exception e2) {
				}
				
			}
	}

}
