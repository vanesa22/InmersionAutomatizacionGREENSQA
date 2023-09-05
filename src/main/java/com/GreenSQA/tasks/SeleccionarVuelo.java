package com.GreenSQA.tasks;

import com.GreenSQA.questions.EncontroVuelodisponible;
import com.GreenSQA.userinterfaces.PaginaVuelosDisponibleMetodos;
import com.GreenSQA.userinterfaces.PaginaVuelosDisponibles;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import java.util.List;

public class SeleccionarVuelo implements Task {
    private PaginaVuelosDisponibleMetodos paginaVuelosDisponibleMetodos;

    public SeleccionarVuelo() {
        this.paginaVuelosDisponibleMetodos = new PaginaVuelosDisponibleMetodos();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listaVuelos = paginaVuelosDisponibleMetodos.obtenerListaVuelo();
        actor.attemptsTo(
                Click.on(listaVuelos.get(1)),
                WaitUntil.the(PaginaVuelosDisponibles.BUTTON_SELECT_FLY, WebElementStateMatchers.isClickable()),
                Click.on(PaginaVuelosDisponibles.BUTTON_SELECT_FLY),
                Click.on(PaginaVuelosDisponibles.BUTTON_ACCEPT_RESTRICTIONS)
        );
    }
}
