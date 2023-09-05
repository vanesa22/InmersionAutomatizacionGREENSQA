package com.GreenSQA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class PaginaVuelosDisponibles extends PageObject {

    public static final Target OUTPUT_MENSAGE = Target.the("Donde aparece No hay vuelos para esta fecha").located(By.xpath("//*[@id=\"main-content\"]/div/div/h1"));
    public static final Target OUTPUT_MENSAGE_VUELO = Target.the("Donde aparece el mensaje que hay vuelos para esta fecha").located(By.id("titleSelectFlightDesktop"));
    public static final Target FLIGHT_LIST = Target.the("Donde aparece la lista de vuelos para esta fecha").located(By.xpath("//*[@id=\"CenterWrapperBodyFlights\"]/ol"));
    public static final Target BUTTON_SELECT_FLY = Target.the("Boton para buscar los vuelos").located(By.xpath("//*[@id=\"RestrictionModal-O00QP5ZB-dialog-open\"]"));
    public static final Target BUTTON_ACCEPT_RESTRICTIONS = Target.the("Boton para buscar los vuelos").located(By.xpath("/html/body/div[6]/div[3]/div/div/div[3]/ul/li[1]/div/div[3]/div[2]/div/button"));

}
