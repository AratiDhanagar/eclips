package eclips;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Datepicker_Function {
	//select Future date
	static void selectFutureDate(WebDriver driver, String month, String year,String date)
	{
		 while(true) 
		  {
			  String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
			  String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  if(current_month.equals(month) && current_year.equals(year))
			  { 
				  break; 
			  }
			  //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous date
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    //future date 
		  }
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
	//select previous date
	static void selectPreviousDate(WebDriver driver, String month, String year,String date)
	{
		 while(true) 
		  {
			  String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); 
			  String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  if(current_month.equals(month) && current_year.equals(year))
			  { 
				  break; 
			  }
			  driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();  //previous date
			  //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    //future date 
		  }
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
	public static void main(String[] args) 
	{
		//use same functionality multiple times in same page
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		String month="August"; 
		String year="2023"; 
		String date="15";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//selectFutureDate(driver,month,year,date);
		selectPreviousDate(driver,month,year,date);
	}
}
