package string_class;

public class class_002 {

	public static void main(String[] args) {
String s =new String ("java-Automation");
String d =new String ("how are you");

// to get index or position of characters
System.out.println("index of characters is :-"+s.indexOf("m"));

// to get sbuString (some characters)
System.out.println("substring is:-"+ s.substring(5));
System.out.println("new string is:-"+s.substring(1, 9));

// to get character with respect to index 
System.out.println(d.charAt(8));
	}

}
