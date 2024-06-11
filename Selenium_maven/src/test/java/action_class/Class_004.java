package action_class;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.Baseclass_1;

public class Class_004 extends Baseclass_1{
	
	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.globalsqa.com/demo-site/draganddrop/");
try {
	take_screenshot("globalsq");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//locate frame
driver.findElement(By.xpath("//iframe[@id='aswift_0']"));
//enter inside frame
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_0']")));
//locate drag image 1
//WebElement drag1 = driver.findElement(By.xpath(("//h5[@class='ui-widget-header'])[1]")));
//locate drag image 2
WebElement drag2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
//locate drag image 3
WebElement drag3 =  driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
//locate drag image 4
WebElement drag4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
//loacate drop element
WebElement drop = driver.findElement(By.cssSelector("div#trash"));

//action class
Actions act = new Actions(driver);
//act.dragAndDrop(drag1, drop).build().perform();
act.dragAndDrop(drag2, drop).build().perform();
act.dragAndDrop(drag3, drop).build().perform();
act.dragAndDrop(drag4, drop).build().perform();
/*act.clickAndHold(drag1).moveToElement(drop).release().build().perform();
act.clickAndHold(drag2).moveToElement(drop).release().build().perform();
act.clickAndHold(drag3).moveToElement(drop).release().build().perform();
act.clickAndHold(drag4).moveToElement(drop).release().build().perform();*/








	}

}




