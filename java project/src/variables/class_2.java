package variables;

public class class_2 {
  //Instance variable
      int i= 300;
//      static variable
      static byte a  = 56;
      // Instance method 
      public void print() {
    	  System.out.println(i);
    	  System.out.println(a);
      }
//      static method
      public static void print_variable() {
    	  System.out.println(a);
      }
      
      


	
	public static void main(String[] args) {
//		Access static method directly
		print_variable();
		 class_2 c2 = new class_2 ();
		System.out.println(c2.i);

	}

}
