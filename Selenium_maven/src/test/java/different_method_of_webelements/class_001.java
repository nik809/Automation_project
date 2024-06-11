package different_method_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_001 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.salesforce.com/in/");
	//capture title
	System.out.println("the title of web page:-"+driver.getTitle());
	//click
	driver.findElement(By.xpath("(//a[@class='cta_button'])[1]")).click();
	
		
	}

}
