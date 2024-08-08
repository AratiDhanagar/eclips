package eclips;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandle {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--incognito");
		opt.setExperimentalOption("exclude Switces", new String[]{"enable-automation"});
		 WebDriver driver= new ChromeDriver(opt);
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc'])")).click();
		 
		 Set<String> windowIDs=driver.getWindowHandles();
		 System.out.println(windowIDs);
		 
		 List<String>windowList= new ArrayList<String>(windowIDs);
		 String parentID= windowList.get(0);
		 System.out.println(parentID);
		 String ChildID= windowList.get(1);
		 System.out.println(ChildID);
	}

}
