package baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Baseclass_1 {
	
	//static variable nd method use it 
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");

	
	
	public static void take_screenshot(String screenshotname) throws IOException {
	 TakesScreenshot ts = (TakesScreenshot) driver ;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File source_file = new File(projectpath+"\\screenshot\\"+screenshotname+".png");
		FileHandler.copy(file, source_file);
	}
	//dynamic code launch browser
	public static void launch_browser(String broswer) {
		if(broswer.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (broswer.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (broswer.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("launches browser is:-"+broswer);		
		
	}
	//navigate url
	public static void navigate_url(String url) {
		driver.get(url);
		System.out.println("navigate url :_"+url);
		System.out.println("the title of webpage is :-"+driver.getTitle());
	}
	
//dynamic code scroll page
	public static void scroll_page(int ypoints) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+ypoints+")");
	}

	
	
	
	
	
	
	

	public static void main(String[] args) {

		
	}

}
