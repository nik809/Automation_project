package different_method_of_webelements;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_004 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.facebook.com/");
		//current url
		System.out.println("current url is:-"+driver.getCurrentUrl());
		//get title
		System.out.println("title of webpage:-"+driver.getTitle());
		//locate textbox
 WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
 //pass input
 email.sendKeys("nikhita@123gmail.com");
 //capture input
 System.out.println("input data of emailtextbox is:-"+email.getAttribute("value"));
 //locate password"
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
 
 
	}

}
