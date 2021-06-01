import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = srctestjavaFeatures,
    glue = {stepDefinition},
    tags = @activity1_1,
    plugin = { pretty, htmltargetcucumber-reportsreports.html },
    monochrome = true
)

public class ActivitiesRunner {
    empty
}