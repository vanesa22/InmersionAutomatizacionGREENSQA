package com.GreenSQA.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Set;

public class CambiarPestania implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
              driver.switchTo().window(tabs.get(1));
    }
}
