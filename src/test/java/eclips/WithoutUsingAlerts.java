package eclips;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WithoutUsingAlerts {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver= new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(3000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
		 Alert clk =mywait.until(ExpectedConditions.alertIsPresent());
		 System.out.println(clk.getText());
		 clk.accept();
		 Thread.sleep(3000); 
		 

	}

}
