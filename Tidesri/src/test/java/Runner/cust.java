package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",
		glue="stepdefinations",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:Reports/report.html"}
		
		)
public class cust {

}
