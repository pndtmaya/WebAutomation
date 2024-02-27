package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class firstPro {
	@Test
	public void myTest()
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Automation Support Folder\\exe\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.flipkart.com/");
				
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(10, null);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//driver.findElement(By.xpath("(//*[@class='_1TOQfO'])[1]")).click();
				driver.findElement(By.xpath("(//*[@class='_1ch8e_'])[4]")).click();
				WebElement electronics=driver.findElement(By.xpath("(//*[@class='_1ch8e_'])[4]"));

				Actions act=new Actions(driver);
				act.moveToElement(electronics);
	}

	/*public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","F:\\Automation Support Folder\\exe\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, null);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("(//*[@class='_1TOQfO'])[1]")).click();
		driver.findElement(By.xpath("(//*[@class='_1ch8e_'])[4]")).click();
		WebElement electronics=driver.findElement(By.xpath("(//*[@class='_1ch8e_'])[4]"));

		Actions act=new Actions(driver);
		act.moveToElement(electronics);		
	}*/

}
