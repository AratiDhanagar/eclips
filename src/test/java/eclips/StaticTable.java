package eclips;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		System.out.println(rows);
		
		
		//find no. of columns
		/*
		 * int
		 * column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size()
		 * ; System.out.println(column);
		 */
		 
		 //read data from specific column
		// String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
		 //System.out.println(bookname);
		 
		 //read all data from table
		/* for(int r=2;r<=rows;r++)//rows
		 {
			 for(int c=1;c<=column;c++)//columns
			 {
				 String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();    //we cam not pass string into xpath only index no we can pass
				 System.out.print(value+"\t");
			 }
			 System.out.println();
		 }*/
		 
		 //print mukesh author's bookname
			
			/*
			 * for(int r=2;r<=rows;r++) { String
			 * authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
			 * "]//td[2]")).getText(); //System.out.println(authorname);
			 * 
			 * if(authorname.equals("Mukesh")) { String
			 * book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
			 * "]//td[1]")).getText(); System.out.println(book+"\t"+authorname); } }
			 */
			 
		 //find total price of all books
		int total=0;
			  for(int r=2;r<=rows;r++) 
			  { 
				  String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText(); //System.out.println(authorname);
				  //System.out.println(price);
				  total=total+Integer.parseInt(price);
				  System.out.println(total);

				  
					/*
					 * if(price.equals("Mukesh")) { String
					 * book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+
					 * "]//td[1]")).getText(); System.out.println(book+"\t"+authorname); }
					 */			  }
	}

}
