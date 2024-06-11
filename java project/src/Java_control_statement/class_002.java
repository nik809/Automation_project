package Java_control_statement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class class_002 {
	public void java() {
		try {
			FileInputStream fis = new  FileInputStream ("path file");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	
				
	}

	public static void main(String[] args) {

	}

}
