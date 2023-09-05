package com.GreenSQA.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.GreenSQA.steps",
        features = "src/test/resources/features/buscar_vuelo.feature",
        tags = "@scenario1",
        snippets = SnippetType.CAMELCASE,
        monochrome = true
)

public class BuscarVuelo {
}
