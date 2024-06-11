package different_method_of_webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class_002 {

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
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
//locate password
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
//clear email input
driver.findElement(By.xpath("//input[@type='text']")).clear();
//clear password input
driver.findElement(By.xpath("//input[@type='password']")).clear();

	}

}
