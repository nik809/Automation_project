package action_class;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class class_006 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
//navigate_url("https://www.facebook.com/");
navigate_url("https://www.reliancedigital.in/");
try {
	take_screenshot("homepage reliance");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Actions act = new Actions(driver);
//press button pageup
act.sendKeys(Keys.PAGE_DOWN).build().perform();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//press button up
act.sendKeys(Keys.PAGE_UP).build().perform();
Actions act1 = new Actions(driver);
//when to enter in another textbox
act1.sendKeys(Keys.TAB).build().perform();


	
		
	}

}
