package eclips;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specific checkbox
		//driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
		
		//select all checkboxes
		/*
		 * List<WebElement> checkbox=driver.findElements(By.
		 * xpath("//input[@class='form-check-input' and @type='checkbox']")); for(int
		 * i=0;i<checkbox.size();i++) { checkbox.get(i).click(); }
		 */
	     
	     //select first 3 checkboxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*
		 * for(int i=0;i<checkboxes.size()-4;i++) { checkboxes.get(i).click(); }
		 */
		
		
		 for(int i=4;i<checkboxes.size();i++) 
		 { checkboxes.get(i).click(); }
		 Thread.sleep(3000);
		
		//unselect checkboxes if selected
		for (int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}
	}

}
