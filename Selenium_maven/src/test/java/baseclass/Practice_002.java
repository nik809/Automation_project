package baseclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Practice_002 extends Baseclass_1 {

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.netmeds.com/");
try {
	take_screenshot("homepage");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("web page"+driver.getTitle());
System.out.println("mouse hoewr on wellness and beauty");
Actions act = new Actions(driver);
WebElement wellness = driver.findElement(By.xpath("//a[text()='Wellness']"));
act.moveToElement(wellness).build().perform();

try {
	take_screenshot("wellness");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

WebElement beauty = driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"));
act.moveToElement(beauty).build().perform();
try {
	take_screenshot("beauty");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//search medicine
WebElement dolo = driver.findElement(By.cssSelector("input#search"));
dolo.sendKeys("dolo");
act.sendKeys(Keys.ENTER).build().perform();
 driver.findElement(By.xpath("//img[@class='product-image-photo']")).click();
 //scroll page
 scroll_page(200);
 //add to cart
 try {                   
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 driver.findElement(By.xpath("(//span[text()='ADD TO CART'])[1]")).click();
 driver.findElement(By.xpath("//div[@class='mini-cart']")).click();
 
 
 

	
	
		
	
}
		
	}


