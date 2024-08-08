package eclips;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InjectionAuthenticated {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		//driver.get("http://username:password@202.66.174.128:9005/");

		driver.get("http://admin@mail.com:admin@202.66.174.128:9005/");
		driver.manage().window().maximize();
		
		
	}

}
