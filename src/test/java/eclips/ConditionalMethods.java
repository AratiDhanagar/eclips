package eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
// will acces these conditional methods from web element not from web pages
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//isdisplayed
		
		 boolean heading=driver.findElement(By.cssSelector("input.wikipedia-search-button")).isDisplayed(); 
		 System.out.println("  "+ heading );
		 
		 //isenabled
		 boolean enabled =driver.findElement(By.xpath("//*[@id=\"name\"]")).isEnabled();
		 System.out.println("name is enabled ? " +enabled);

		//isselected - to check element is swlwcted or not 
		 WebElement male =driver.findElement(By.xpath("//*[@id=\"male\"]"));
		 WebElement female =driver.findElement(By.xpath("//*[@id=\"female\"]"));

		 // before selection
		 System.out.println("before selection......");
		 System.out.println(male.isSelected());
		 System.out.println(female.isSelected());
		 
		 System.out.println("after selection male......");
		 male.click();
		 System.out.println(male.isSelected());
		 System.out.println(female.isSelected());

		 System.out.println("after selection female......");
		 female.click();
		 System.out.println(male.isSelected());
		 System.out.println(female.isSelected());
		 
		 System.out.println("checkbox");
		 WebElement sunday =driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		 System.out.println(sunday.isSelected()); 
	}
}
