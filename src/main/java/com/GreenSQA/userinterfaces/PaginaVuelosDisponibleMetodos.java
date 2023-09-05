package com.GreenSQA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PaginaVuelosDisponibleMetodos extends PageObject {
    public List<WebElementFacade> obtenerListaVuelo() {
        return findAll("//*[@id=\"CenterWrapperBodyFlights\"]/ol/li");
    }
    public List<WebElementFacade> obtenerTipoVuelo() {
        return findAll("//*[@id=\"WrapperCardFlight0\"]/ol//li");
    }
    public List<WebElementFacade> obtenerListaVueloVuelta() {
        return findAll("//*[@id=\"CenterWrapperBodyFlights\"]/ol/li");
    }
}
