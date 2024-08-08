package eclips;

import java.time.Duration;
//import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_statictable {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement departure =driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select drp= new Select(departure);
		drp.selectByVisibleText("Boston");
		
		WebElement destination =driver.findElement(By.xpath("//select[@name='toPort']"));
		Select dst= new Select(destination);
		dst.selectByVisibleText("London");
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		int rows=driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size();
		System.out.println(rows);
		//int price=0;
		for(int i=1;i<=rows;i++)
		{
			String price1=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
			Integer.parseInt(price1);
		}
		//Arrays.sort(price);
		
		
	}

}
