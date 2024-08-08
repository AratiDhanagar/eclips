package eclips;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicAutoSuggestions {

	public static void main(String[] args) {

		/*
		 * WebDriver driver= new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("testing");
		 * List<WebElement> a= driver.findElements(By.xpath(
		 * "//ul[@role=\"listbox\"]//li//div[@role=\"option\"]"));
		 * System.out.println(a.size());
		 * 
		 * for(int i=0;i<a.size();i++) { System.out.println(a.get(i).getText());
		 * if(a.get(i).getText().equals("testing interview questions")) {
		 * a.get(i).click(); break; } }
		 */
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("mobile 5g");
		List<WebElement> mobile= driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc']//li"));
		System.out.println(mobile.size());

		for(int i=0;i<mobile.size();i++)
		{
			System.out.println(mobile.get(i).getText());
			
			  if(mobile.get(i).getText().equals("mobile 5g")); 
			  { mobile.get(i).click(); }
			 
		}
	}

}
