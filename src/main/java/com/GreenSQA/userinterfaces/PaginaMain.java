package com.GreenSQA.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class PaginaMain extends PageObject {
  public static final Target INPUT_ORIGIN = Target.the("Donde escribimos el origen del vuelo").located(By.id("txtInputOrigin_field"));
  public static final Target ORIGIN = Target.the("Donde ").located(By.id("popperExtended"));
  public static final Target INPUT_DESTINATION = Target.the("Donde escribimos el destino del vuelo").located(By.id("txtInputDestination_field"));
  public static final Target DESTINATION = Target.the("Donde destino del vuelo").located(By.id("popperExtended"));
  public static final Target INPUT_DEPARTURE_DATE = Target.the("Donde escribimos la fecha de ida del vuelo").located(By.id("departureDate"));
  public static final Target INPUT_DEPARTURECALENDAR_MOUNTH = Target.the("Donde escribimos la fecha de ida del vuelo").located(By.xpath("//*[@id=\"calendarContainer\"]/div/div/div/div/div[2]/div[2]/div"));

  public static final Target BUTTON_GO_NEXT_MONTH = Target.the("Boton para que cargue los siguientes meses").located(By.xpath("//*[@id=\"calendarContainer\"]/div/div/div/div/div[2]/div[1]/div[2]"));
  public static final Target INPUT_ARRIVAL_DATE = Target.the("Donde escribimos la fecha de vuelta del vuelo").located(By.className("sc-bCQtTp ganQdL"));
  public static final Target INPUT_PASAJERO = Target.the("Donde escribimos la cantidad de pasajeros niños").located(By.id("btnAddPassengerCTA"));
  public static final Target BUTTON_PASAJERO_ADULTS_ADD = Target.the("Donde aumentamos la cantidad de pasajeros adultos").located(By.id("btnPlusAdults"));
  public static final Target BUTTON_PASAJERO_ADULTS_SUBSTRACT = Target.the("Donde disminuimos la cantidad de pasajeros adultos").located(By.id("btnSubstractAdults"));
  public static final Target BUTTON_PASAJERO_CHILDREN_ADD = Target.the("Donde aumentamos la cantidad de pasajeros niños").located(By.id("btnPlusChildren"));
  public static final Target BUTTON_PASAJERO_CHILDREN_SUBSTRACT = Target.the("Donde disminuimos la cantidad de pasajeros niños").located(By.id("btnSubstractChildren"));
  public static final Target BUTTON_SEARCH = Target.the("Boton para buscar los vuelos").located(By.id("btnSearchCTA"));

}
