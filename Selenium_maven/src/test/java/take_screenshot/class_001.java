package take_screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class_001 {

	public static void main(String[] args) throws IOException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.facebook.com/");

     String projectpath = System.getProperty("user.dir");
System.out.println(projectpath);
// take screenshot
	 TakesScreenshot ts = (TakesScreenshot) driver ;
	File file = ts.getScreenshotAs(OutputType.FILE);
	File source_file = new File(projectpath+"\\screenshot\\homepage.png");
	FileHandler.copy(file, source_file);
	}

}