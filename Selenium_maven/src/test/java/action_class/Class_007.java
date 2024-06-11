package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_007 extends Baseclass_1{

	public static void main(String[] args) {
		launch_browser("chrome");
		navigate_url("https://www.facebook.com/");
//current url
System.out.println("current url is:-"+driver.getCurrentUrl());
//get title
System.out.println("title of webpage:-"+driver.getTitle());
//locate textbox
driver.findElement(By.cssSelector("input#email"));
//action class
Actions act = new Actions(driver);
//pass input in uppercase
act.keyDown(Keys.SHIFT).sendKeys("niku").build().perform();
//act.sendKeys(Keys.SHIFT).sendKeys("niku").build().perform();
//to enter in if there is no entry option in search box
act.sendKeys(Keys.ENTER).build().perform();


	}

}
