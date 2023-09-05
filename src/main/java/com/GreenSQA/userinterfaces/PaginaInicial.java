package com.GreenSQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.latamairlines.com/co/es")
public class PaginaInicial extends PageObject {
    public static final Target BUTTON_CLOSE_LOGIN = Target.the("Boton para cerra la ventana de login").located(By.id("button-close-login-incentive"));
}
