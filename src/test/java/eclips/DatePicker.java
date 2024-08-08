package eclips;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{	
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch  to frame
		driver.switchTo().frame(0);
		
		//pick dater using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("29/05/2024");
		
		//using datepicker element
		
		  String month="June"; 
		  String year="2024"; 
		  String date="26";
		  driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		  while(true) 
		  {
			  String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
			  String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		  
			  if(current_month.equals(month) && current_year.equals(year))
			  { 
				  break; 
			  }
			  //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			  //previous date //
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			  //future date }
			 
			//select date 
			  List<WebElement> alldates=driver.findElements(By.xpath( "//*[@id='ui-datepicker-div']//tbody//tr//td//a"));	
			  for(WebElement dt:alldates)
			  {
				  if(dt.getText().equals(date))
				  {
					  dt.click();
					  break;
				  }
			  }
		  }
	}
}
