package mapping;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable
{
	public Hookable()
	{
		
	}
	
	
	

	@Before
	public void before(Scenario scenario)
	{
		System.out.println("---------------Scenario start-------------------");
	}
	@After
	public void after(Scenario scenario)
	{
		System.out.println("---------------Scenario end-------------------");
			
	}

}
