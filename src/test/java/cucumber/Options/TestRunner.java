package cucumber.Options;
import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/java/features/Login.feature",
glue= "stepDefinations",
tags= ("@UpdatePlaceAPI"),
stepNotifications = true
)
public class TestRunner {
//tags= {"@DeletePlace"}  compile test verify
}
