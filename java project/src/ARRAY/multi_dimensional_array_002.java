package ARRAY;

public class multi_dimensional_array_002 {

	public static void main(String[] args) {
// declar without memory allocation
		// a b c
		// d e f 
		// g h i
		
		char [][] single_character = {{'a','b','c'},{'d','e','f','g','h','i'}};
		System.out.println(single_character[2][2]);
		// print all value
		for(int i =0; i<=2; i++) {
			for(int j = 0;j<=2; j++) {
				System.out.print(single_character[i][j]+" ");}
			System.out.println();
			}
		}
	}

	


