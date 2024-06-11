package static_dropdown;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.Baseclass_1;

public class class_001 extends Baseclass_1{

	public static void main(String[] args) {
launch_browser("chrome");
navigate_url("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=Cj0KCQjw9vqyBhCKARIsAIIcLMHThWNUlX8-0NIeD0AZ1iPysWJ7DEuQRdjnxx_1mQ_R-eOGaNhlvWIaAh89EALw_wcB");
try {
	take_screenshot("homepage_jeevansathi");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  WebElement profile_dropdown = driver.findElement(By.xpath("(//select[@name='reg[relationship]'])[1]"));
// select class with argument as dropdown
  Select s = new Select(profile_dropdown);
  // select option by visible text
  s.selectByVisibleText("self");
//select by value
//s.selectByValue("1");
//select option by index
//s.selectByIndex(2);
	
	}

}
