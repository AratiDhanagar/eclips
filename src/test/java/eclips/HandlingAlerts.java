package eclips;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//types of alerts- 
		/*
		 * normal alert - only ok button confirmation alert- ok and cancle input alert-
		 * give input and click on ok or cancle
		 */
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
		 * Thread.sleep(3000); driver.switchTo().alert().accept(); Thread.sleep(2000);
		 * driver.quit();
		 */	
		
		// comfirmation alert
		/*
		 * driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
		 * Thread.sleep(2000); Alert conf_alert =driver.switchTo().alert(); //Alert
		 * conf_alert =driver.switchTo().dismiss();
		 * System.out.print(conf_alert.getText()); conf_alert.accept();
		 */
			
		//prompt alert
		
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
		Thread.sleep(2000);
		Alert prompt_alert= driver.switchTo().alert();
		prompt_alert.sendKeys("Harry Potter");
		Thread.sleep(2000);
		prompt_alert.accept();
	}

}
