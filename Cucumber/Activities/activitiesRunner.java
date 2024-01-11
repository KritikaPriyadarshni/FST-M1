package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefenitions"},
        //tags = "@SmokeTest",
        plugin = {"pretty"},
        monochrome = true,
        // tags = "@activity1"
        //tags = "@activity2"
        //tags = "@activity3"
        //tags = "@SimpleAlert"
        //tags = "@ConfirmAlert"
        //tags = "@PromptAlert"
        //tags = "@SimpleAlert and @ConfirmAlert"
        //tags = "@activity4"
        tags = "@activity5"
)






public class activitiesRunner {
}
