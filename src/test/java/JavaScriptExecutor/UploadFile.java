package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFile {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		option.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"uploadFile\"]")).sendKeys("C:\\Users\\DELL\\Downloads\\summary.csv");
		
		if(driver.findElement(By.xpath("//*[@id=\"uploadedFilePath\"]")).getText().equals("C:\\fakepath\\summary.csv"))
		{
			System.out.println("file uploaded successfully");
		}else {System.out.println("file not uploaded");}
	}

}
