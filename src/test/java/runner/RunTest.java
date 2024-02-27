package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
 features="src/test/resources/BussinessLogic",
 glue="mapping",
 tags="@Regression",
 plugin="pretty",
 monochrome=true,
 dryRun=false,
 strict=true
		
)
public class RunTest extends AbstractTestNGCucumberTests
{

}


