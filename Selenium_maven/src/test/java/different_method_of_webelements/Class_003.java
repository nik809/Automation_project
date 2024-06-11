package different_method_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_003 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.facebook.com/");
		//current url
		System.out.println("current url is:-"+driver.getCurrentUrl());
		//get title
		System.out.println("title of webpage:-"+driver.getTitle());
	  WebElement link = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	 //capture link
	  System.out.println("name of link:-"+link.getText());
	  //capture attribute
	  System.out.println("attribute of element is:-"+link.getAttribute("href"));
	  link.click();
	  
	  
	}

}
