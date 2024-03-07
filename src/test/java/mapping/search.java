package mapping;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class search 
{
	WebDriver driver;
	@Before
	public void before() 
	{
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
@After
public void after() {
 driver.close();  
}
	

@Given("I navigating to Google website")
public void i_navigating_to_Google_website() 
{
	driver.get("https://www.google.com/");
   }


@Then("^I enter (.*) in search textbox$")
public void i_enter_in_search_textbox(String keyword1)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(keyword1);
	     
}

@Then("I click at Search button")
public void i_click_at_Search_button() 
{//(//*[@class='gNO89b'])[1]
   driver.findElement(By.xpath("(//*[@class='gNO89b'])[1]")).click();

}



@Then("^I verify (.*) on search page$")
public  void i_verify_on_search_page(String keyword2)
{
	//static 
	String Searched_keyword=driver.findElement(By.xpath("//*[@class='PZPZlf ssJ7i B5dxMb']")).getText();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	System.out.println(keyword2);
	System.out.println(Searched_keyword);
	if(Searched_keyword.equalsIgnoreCase(keyword2))
     {
    	System.out.println("Pass");    
    }
    else
    {
    	System.out.println("failed");    
    }
   
}




}
