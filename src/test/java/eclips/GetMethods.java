package eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetMethods {
//get method only workds with web pages not with web element 
// conditional methods will work with web elements 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		WebDriver driver= new ChromeDriver(option);
		driver.navigate().to("https://www.google.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		driver.navigate().back();
		
		
		//get title 
		System.out.println(driver.getTitle());
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		//get window handle it mwans get id of window
		//System.out.println(driver.getWindowHandle());
		
		
		WebElement text =driver.findElement(By.xpath("//a[text()='Posts (Atom)']"));
		text.click();
		
		System.out.println(driver.getWindowHandles());
		//driver.close();   //close 1st window or closes single window 
		//driver.quit();		// close all windows
		
		}
}