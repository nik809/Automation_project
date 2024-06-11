package baseclass;

import java.awt.Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice_003 extends Baseclass_1{
	public static String month_year;

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.railyatri.in/");
scroll_page(200);
//locate from city
WebElement from_city = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
from_city.sendKeys("hinganghat");
//locate from city option
List<WebElement> from_city_options = driver.findElements(By.xpath("//ul[@id='ui-id-5']/li"));
//choose one option from
for(int i = 0; i<from_city_options.size(); i++) {
	if(from_city_options.get(i).getText().contains("HINGANGHAT | HGT")) {
	from_city_options.get(i).click();
	}
}
System.out.println("entered from city:-"+from_city.getAttribute("value"));

//locate from city
WebElement to_city = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
to_city.sendKeys("wardha");
//locate from city option
List<WebElement> to_city_options = driver.findElements(By.xpath("(//ul[@id='ui-id-6']//li)[1]"));
//choose one option from
for(int x = 0; x<to_city_options.size(); x++) {
	if(to_city_options.get(x).getText().contains("WARDHA JN | WR")) {
	to_city_options.get(x).click();
	}
System.out.println("entered to city:-"+to_city.getAttribute("value"));
//click on calender
WebElement date_dropdown = driver.findElement(By.cssSelector("input#datepicker_train"));
date_dropdown.click();
while(true) {
	//capture month and year
String month_year = driver.findElement(By.xpath("//th[text()='June 2024']")).getText();

if(!(month_year.equalsIgnoreCase("June 2024"))) {
	  //click next button
	  driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
	  
}
else {
	  break;
}}
//select date
driver.findElement(By.xpath("//td[text()='9']")).click();
//capture select month
System.out.println("selected month is :-"+month_year);
//capture selected date
System.out.println("selected date is :-"+date_dropdown.getAttribute("value"));
}
//search train
 driver.findElement(By.xpath("//button[@type='submit']")).click();
 scroll_page(800);

 // book now
 driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
	


	}}

	


