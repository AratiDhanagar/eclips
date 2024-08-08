package eclips;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveAutoMsg {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();//used to remove chrome is controlled by automated test software message 
		
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}

}
