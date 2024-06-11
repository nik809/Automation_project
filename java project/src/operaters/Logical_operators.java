package operaters;

public class Logical_operators {

	public static void main(String[] args) {
    int i = 9;
    int a = 20;
    //Logical And
     System.out.println(i<15&&a>100);
     System.out.println(i>5&&a<200);
     System.out.println(i>20&&a>400);
     System.out.println(i<50&&a<500);
     float f = 20.7f;
     double d = 100.78;
     //Logical or 
     System.out.println(f<10||d>500);
     System.out.println(f>15||d<300);
     System.out.println(f<40||d>60);
     System.out.println(f>10||d>30);
     //Logical not
  
     long l =3000;
     long j = 5000;
     System.out.println(!(l==3000&&j<7000));
     System.out.println(!(l==3000&&j<6000));
     System.out.println(!(l==3000&&j>2000));
     System.out.println(!(l==3000&&j<1000));
     

	}

}
