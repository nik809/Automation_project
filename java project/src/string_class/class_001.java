package string_class;

public class class_001 {

	public static void main(String[] args) {
String s = "java";
int r = s.length();
System.out.println("length of string:-"+r);
System.out.println("length of string is :-"+s.length());
// to replace some characters from given string 
String a = s.replace("v", "w");
System.out.println(a);
System.out.println(s.replace("a", "b"));
System.out.println(s.replaceFirst("a", "b"));


	}

}
