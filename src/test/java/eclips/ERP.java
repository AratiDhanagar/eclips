package eclips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERP {
	public static void main(String[] args) {
		System.out.println("want to run ERP");
		WebDriver driver = new ChromeDriver();
		// Admin login
		driver.get("http://103.172.151.211:9003");
		driver.manage().window().maximize();
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		mail.sendKeys("admin@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/form/button")).click();
		// dashboard
		
		 String title =driver.getTitle(); System.out.println(title);
		 WebElement globleMaster= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/aside/div/div[1]/div[2]/ul/li[2]/a"));
		 globleMaster.click();
		
		/*
		 * List<WebElement> modules= driver.findElements(By.tagName("ul"));
		 * System.out.println(modules.size());
		 */	 
	}
}