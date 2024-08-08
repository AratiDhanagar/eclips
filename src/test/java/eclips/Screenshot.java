package eclips;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		//fullpage screenshot
		/*
		 * TakesScreenshot ts= (TakesScreenshot)driver; //done type casting here bcoz
		 * parent class is webdriver //takescreenshot ts= driver; this comes when
		 * chromedriver driver= new chromedriver(); File
		 * sourcefile=ts.getScreenshotAs(OutputType.FILE); File targetFile= new
		 * File("C:\\Users\\DELL\\eclipse-workspace\\eclips\\Screenshot\\fullpage.png");
		 * //File targetFile= new
		 * File(system.getproperty("user.dir")+"\\Screenshot\\fullpage.png");
		 * sourcefile.renameTo(targetFile);// copy source file to traget file
		 */	
		
		//Webelement screenshot
		/*
		 * WebElement iphone =driver.findElement(By.xpath("//*[@id=\"HTML8\"]/h2"));
		 * File sourcefile=iphone.getScreenshotAs(OutputType.FILE); File targetFile= new
		 * File(System.getProperty("user.dir") +"\\Screenshot\\iphone.png");
		 * sourcefile.renameTo(targetFile);
		 */
		

		//specific area screenshot
		WebElement footer =driver.findElement(By.xpath("//*[@id=\"carousel-banner-1\"]"));
		File sourcefile=footer.getScreenshotAs(OutputType.FILE);
		File targetFile= new File(System.getProperty("user.dir") +"\\Screenshot\\footer.png");
		sourcefile.renameTo(targetFile);
	}

}