package eclips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeHeadLess 
{
	public static void main(String[] args) throws InterruptedException {

	      // object of EdgeOptions
	      EdgeOptions opt = new EdgeOptions();

	      // browser in headless mode
	      opt.addArguments("--headless=new");

	      // Initiate the Webdriver
	      WebDriver driver = new EdgeDriver(opt);

	      // adding implicit wait of 10 secs
	     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      // Opening the webpage with headless mode
	      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

	      // getting page title
	      System.out.println("Getting the page title: " + driver.getTitle());

	      // Quit browser
	      driver.quit();
	   }
}
