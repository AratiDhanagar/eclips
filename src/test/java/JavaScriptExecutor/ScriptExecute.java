package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptExecute {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//alternate of sendkeys method
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		//email.sendKeys("admin@gmail.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','admin@gmail.com');",email );
		
		//alternate of click method
		WebElement radio_button=driver.findElement(By.xpath("//*[@id=\"female\"]"));
		js.executeAsyncScript("arguments[0].click()",radio_button);
	}

}
