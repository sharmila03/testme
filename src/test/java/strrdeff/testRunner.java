package strrdeff;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/src/test/resources/feature/Login.feature",
                  glue="strrdeff",
                  plugin="html:target/htmlreport")
public class testRunner {

}
