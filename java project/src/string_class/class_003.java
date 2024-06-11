package string_class;

public class class_003 {
	String s = "nagpur";
	String r = "wardha";
	String p = "warora";
	String a = "";
	public static String t = "  chandrapur  ";
	static String m = "given";
	String v = "ab";
	String x = "cd";
	
	public void get_String() {
		// to add another string in given string 
		System.out.println(s.concat(" is orange city"));
		System.out.println(s+" is big city");
		// to make string in lower case 
		System.out.println(r.toLowerCase());
		System.out.println(p.toUpperCase());
		// to remove begining and ending space from string
	System.out.println(t.trim());
	System.out.println("cd");
	// to check string empty or not
	System.out.println(a.isEmpty());
	// to check characters with is present or not
	System.out.println(m.contains("gv"));// false because seq. line wise
	System.out.println(m.contains("gi"));// true because seq. line wise
	// to compare two string which is equal or not
	System.out.println(v.equals("ab"));
	// to ignore case b/t two string 
	String ab = "TRAIN";
	String xy = "train";
	System.out.println(ab.equalsIgnoreCase(xy));
	System.out.println(ab.equalsIgnoreCase(ab));
	// to check ending characters of string 
	String op = "sunday";
	System.out.println(op.endsWith("ay"));
	System.out.println(op.endsWith("k"));
	// to print characters in forward direction 
	String m = "you will do great";
	for(int x = 0; x<m.length();x++) {
		System.out.print(m.charAt(x)+"  ");
	}
	for (int y=m.length()-1; y>=0; y--) {
		System.out.print(m.charAt(y)+" ");
		
	}
	}
	

	public static void main(String[] args) {
		 class_003 n = new  class_003();
		 n.get_String();
	}

}
