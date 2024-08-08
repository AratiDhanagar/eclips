package eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		/*
		 * driver.get("https://demo.nopcommerce.com/");
		 * driver.manage().window().maximize();
		 */
		
		//tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag class   tag.classname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("t-shirts");
		
		//tag attribute
		//driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("t-shirts");
		
		//tag class attribute
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("t-shirts");
		driver.get("https://demo.opencart.com/index.php?route=product/search&language=en-gb");
		driver.manage().window().maximize();
		
		//tag id 
		//driver.findElement(By.cssSelector("input#input-search")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector("#input-search")).sendKeys("t-shirt");
		
		//tag class
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("t-shirts");
		
		//tag attribute
		//driver.findElement(By.cssSelector("[name=\"search\"]")).sendKeys("t-shirts");
		//driver.findElement(By.cssSelector("[name=\"search\"])).sendKeys("products");
		
		//tag class attribute
		driver.findElement(By.cssSelector(".form-control[name=\"search\"]")).sendKeys("products");

	}

}
