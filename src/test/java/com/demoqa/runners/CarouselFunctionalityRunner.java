package com.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/carousel_functionality.feature",
        glue = "com.demoqa.stepsdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CarouselFunctionalityRunner {
}
