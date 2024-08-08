package eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//single attribute xpath
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ARATI");

		//multiple attribute XPath
		//driver.findElement(By.xpath("//input[@class='wikipedia-search-input'][@id='Wikipedia1_wikipedia-search-input']")).sendKeys("ARATI");
		
		//contains xpath
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Arati@gmail.com");
		
		//AND OR operators
		//driver.findElement(By.xpath("//input[@class='wikipedia-search-input' and @id='Wikipedia1_wikipedia-search-input']")).sendKeys("prodcts"); //both should be true
		//driver.findElement(By.xpath("//input[@class='wikipedia-search-input' or @id='Wikipedia1_wikipedia']")).sendKeys("prodcts"); // atleast one should be correct

		//start with 
		driver.findElement(By.xpath("//input[starts-with(@class,'wikipedia-search')]")).sendKeys("prodcts");
		
		//Xpath with inner text
		boolean text =driver.findElement(By.xpath("//a[text()='Posts (Atom)']")).isDisplayed();
		System.out.println("display status: "+ text);		
		
	}
}
