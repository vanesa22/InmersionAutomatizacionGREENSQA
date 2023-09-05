package com.GreenSQA.questions;


import com.GreenSQA.userinterfaces.PaginaVuelosDisponibleMetodos;
import com.GreenSQA.userinterfaces.PaginaVuelosDisponibles;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class EncontroVuelodisponible implements Question<Boolean> {
    private PaginaVuelosDisponibleMetodos paginaVuelosDisponibleMetodos;


    public EncontroVuelodisponible() {
        this.paginaVuelosDisponibleMetodos = new PaginaVuelosDisponibleMetodos();
    }
    public static EncontroVuelodisponible EncontroVuelodisponible() {
        return new EncontroVuelodisponible();

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean existenVuelos = false;
        String outText = Text.of(PaginaVuelosDisponibles.OUTPUT_MENSAGE_VUELO).viewedBy(actor).asString();
        String text = outText.split("\n")[0];
        if (text.equals("Elige un vuelo de ida") || text.equals("Elige un vuelo de vuelta")) {

            List<WebElementFacade> listaVuelos;
            listaVuelos = paginaVuelosDisponibleMetodos.obtenerListaVuelo();
            if(listaVuelos.size() >0){
                existenVuelos = true;
            }
        }
        return existenVuelos;
    }


}
