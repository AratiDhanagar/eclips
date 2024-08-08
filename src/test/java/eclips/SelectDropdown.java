package eclips;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dd_country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drp_country= new Select(dd_country);
		
		//select option from dd
		
		//drp_country.selectByVisibleText("India"); 
		//drp_country.selectByValue("uk");
		//drp_country.selectByIndex(8);
		
		//capture all options from list
		List<WebElement> options =drp_country.getOptions();
		System.out.println(options.size());
		
		//printing options
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		
	}

}
