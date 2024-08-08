package eclips;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		//explicit wait is applicable only for specific line, it works based on condition if condition true then it will execute
		//when exception occure that time will use explicit wait  
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement name =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='name']")));
		name.sendKeys("arati");
		
		/*
		 * WebElement txt
		 * =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//button[text()='New Browser Window']"))); txt.click();
		 */
		WebElement clck =mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='New Browser Window']")));
		clck.click();
	}

}
