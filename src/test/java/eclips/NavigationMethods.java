package eclips;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//navigate to - it will work like get url
		//driver.navigate().to("https://demo.opencart.com/");
		//or
		
		URL myurl= new URL("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().to(myurl);
		System.out.println(driver.getTitle());
		
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		driver.navigate().forward();
		 driver.navigate().forward(); System.out.println(driver.getTitle());
		 Thread.sleep(3000);		 
		 
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.close();
	}

}
