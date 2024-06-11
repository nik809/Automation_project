package different_method_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_005 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.facebook.com/");
		//current url
		System.out.println("current url is:-"+driver.getCurrentUrl());
		//get title
		System.out.println("title of webpage:-"+driver.getTitle());
		 WebElement email = driver.findElement(By.xpath("//input[@type='password']"));
		 //get location x-axis
System.out.println("location with respect to x-axis:-"+email.getLocation().x);
//get location y-axis
System.out.println("location with respect to y-axis:-"+email.getLocation().y);
//get size
System.out.println("size of email box:-"+email.getSize());


	}

}
