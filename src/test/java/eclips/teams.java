package eclips;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class teams 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//classname to locate group of webelement
		List<WebElement> t=driver.findElements(By.className("list-inline-item"));
		System.out.println(t.size());
		
		//tagname to locate group of webelements
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//total images on page 
		List<WebElement> image= driver.findElements(By.tagName("img"));
		System.out.println("total no. of images:"+image.size());

	}
}
