package baseclass;

import java.io.IOException;

import org.openqa.selenium.By;

public class practice_001 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.amazon.in/");
//capture titleand currenturl
System.out.println("the title of web page is:- "+driver.getTitle());
System.out.println("the current url is:-"+driver.getCurrentUrl());
//take screenshot
try {
	take_screenshot("amazon web page");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("link:-amazon mobile");
driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
//take screenshot
try {
	take_screenshot("mobile");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("link:-todaysdeals");
driver.findElement(By.xpath("//a[text()='Twitter']")).click();
//takescreenshot
try {
	take_screenshot("todaysdeals");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	//screenshort
	System.out.println("sell");
	driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]")).click();
	//takescreenshot
	try {
		take_screenshot("sell");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}






	

}
}