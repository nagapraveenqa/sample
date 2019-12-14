package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//@CucumberOptions(features="feature",glue="E:\\praveen\\Cucumber\\src\\test\\java\\testscripts\\Tc1.java")
@CucumberOptions(features="feature",
glue={"E:\\praveen\\Cucumber\\src\\test\\java\\testscripts\\Tc1.java"},
plugin={"html:target/cucumber-html-report",
"junit:target/cucumber-results.xml"}                    
                  ) 

public class runner {

}
