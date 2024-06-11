package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class class_001 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.flipkart.com/");
try {
	take_screenshot("flipkart_homepage");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
		
}
//locate grocery link
WebElement link_grocery = driver.findElement(By.xpath("//span[text()='Grocery']"));
Actions act = new Actions(driver);
//act.click(link_grocery).build().perform();
//locate fashion link
WebElement link_fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
//mouse hoewr 
act.moveToElement(link_fashion).build().perform();
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	take_screenshot("fashion");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
// link-home & furniture
WebElement link_hone_furniture = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
//mouse hoewr 
act.moveToElement(link_hone_furniture).build().perform();
try {
	take_screenshot("link_hone_furniture");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//perform right click
act.moveToElement(link_hone_furniture).contextClick();
	}

}
