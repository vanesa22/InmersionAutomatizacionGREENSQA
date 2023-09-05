package com.GreenSQA.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class PaginaMainMetodos extends PageObject {
    public List<WebElementFacade> obtenerMesesCalendario() {
        return findAll("//*[@id=\"calendarContainer\"]/div/div/div/div/div[2]/div[2]/div//div/div/div");
    }

    public List<WebElementFacade> obtenerDiasCalendario(int posicionMes) {
        return findAll("//*[@id=\"calendarContainer\"]/div/div/div/div/div[2]/div[2]/div//div["+(posicionMes+1)+"]//td/span");
    }
}
