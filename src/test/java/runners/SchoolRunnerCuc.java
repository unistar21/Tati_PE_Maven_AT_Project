package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "summary"},
        glue = {"tests.school.cucumber"},
        features = {"src/test/resources/features/School.feature"}
        )

public class SchoolRunnerCuc {
}
