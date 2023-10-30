package com.Batch30_Sprint2_Implementation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/Batch30_Sprint2_Implementation/step_definitions"
)
public class FailedTestRunner {
}


