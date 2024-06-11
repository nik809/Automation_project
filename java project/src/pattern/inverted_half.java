package pattern;

public class inverted_half {

	public static void main(String[] args) {
  
		
		//        *
		//     *  *
		//   * *  *
		//*  * *  *
		 
		
		for(int i=1; i<=4; i++) {
			//print space
			for(int j=1; j<=4-i; j++) {
				System.out.print(" ");

			}
			//To print
			for(int y=1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
