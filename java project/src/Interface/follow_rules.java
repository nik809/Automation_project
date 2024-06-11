package Interface;

public class follow_rules implements Traffic_signal, ab_{
	

	public static void main(String[] args) {
		follow_rules ab = new follow_rules();
		ab.green();
		ab.yellow();
		ab.red();
		// interface object-directly
	//	Traffic_signal G = new Traffic_signal();
		//interface object in-directly
		Traffic_signal f = new follow_rules();
		// INTERFACE CHAVREFERENCE VAR USE HOT AAHE CURRENT CLASS CHA OBJECT
		
	}

	@Override
	public void green() {
		System.out.println("proceed with 60kmph");
		
	}

	@Override
	public void yellow() {
		System.out.println("proceed with 30kmph");
		
	}

	@Override
	public void red() {
System.out.println("stop here");		
	}

}
