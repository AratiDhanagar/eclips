package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileupload {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//single file upload
		/*
		 * driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys(
		 * "C:\\Users\\DELL\\Documents\\ExamDetails_Seatting.txt");
		 * if(driver.findElement(By.xpath("//*[@id=\"fileList\"]//li")).getText().equals
		 * ("ExamDetails_Seatting.txt")) {
		 * System.out.println("file uploaded successfully"); } else {
		 * System.out.println("File not uploaded"); }
		 */
		
		//multiple file upload
		String file1="C:\\Users\\DELL\\Documents\\ExamDetails_Seatting.txt";
		String file2="C:\\Users\\DELL\\Downloads\\image.png";
		
		driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
		WebElement list=driver.findElement(By.xpath("//*[@id=\"fileList\"]//li"));
		list.getSize();
		
	}

}
