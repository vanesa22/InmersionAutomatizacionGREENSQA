package com.GreenSQA.tasks;

import com.GreenSQA.model.DatosVuelo;
import com.GreenSQA.userinterfaces.PaginaInicial;
import com.GreenSQA.userinterfaces.PaginaMain;
import com.GreenSQA.userinterfaces.PaginaMainMetodos;
import com.GreenSQA.utils.FechaUtileria;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptJob;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;
import java.time.LocalDateTime;
import java.util.List;

public class AgregarInformacionVuelo implements Task {
    private DatosVuelo datosVuelo;
    private PaginaMainMetodos paginaMainMetodos;

    public AgregarInformacionVuelo(DatosVuelo datosVuelo) {
        this.datosVuelo = datosVuelo;
        this.paginaMainMetodos = new PaginaMainMetodos();
    }

    public static AgregarInformacionVuelo AgregarInformacionVuelo(DatosVuelo pardatosVuelo) {
        return Tasks.instrumented(AgregarInformacionVuelo.class, new DatosVuelo(
                pardatosVuelo.getAtrOrigen(),
                pardatosVuelo.getAtrDestino(),
                pardatosVuelo.getAtrFechaIda(),
                pardatosVuelo.getAtrFechaVuelta(),
                pardatosVuelo.getAtrPasajero()));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //(Performable) Click.on(PaginaInicial.BUTTON_CLOSE_LOGIN),
                (Performable) Click.on(PaginaMain.INPUT_ORIGIN),
                Enter.theValue(datosVuelo.getAtrOrigen()).into(PaginaMain.INPUT_ORIGIN),
                Hit.the(Keys.ARROW_DOWN).into(PaginaMain.INPUT_ORIGIN),
                Click.on(PaginaMain.ORIGIN),
                Enter.theValue(datosVuelo.getAtrDestino()).into(PaginaMain.INPUT_DESTINATION),
                Hit.the(Keys.ARROW_DOWN).keyIn(PaginaMain.INPUT_DESTINATION),
                Click.on(PaginaMain.ORIGIN),
                Click.on(PaginaMain.INPUT_DEPARTURE_DATE)

        );

        boolean fechaIdaEncontrada = this.seleccionarFecha(actor, this.datosVuelo.getAtrAnioIda(), this.datosVuelo.getAtrMesIda(), this.datosVuelo.getAtrDiaIda());
        if (fechaIdaEncontrada) {
            if (this.datosVuelo.getAtrAnioIda() <= this.datosVuelo.getAtrAnioVuelta())
                this.seleccionarFecha(actor, this.datosVuelo.getAtrAnioVuelta(), this.datosVuelo.getAtrMesVuelta(), this.datosVuelo.getAtrDiaVuelta());
            actor.attemptsTo(
                    Click.on(PaginaMain.BUTTON_SEARCH)
//                    Switch.toWindow("Selección de vuelos | LATAM Airlines")
                    );

        } else {
            System.out.println("La fecha ingresada es menor a la fecha de salida");
        }

    }

    private <T extends Actor> boolean seleccionarFecha(T actor, int anioABuscar, String mesABuscar, int diaABuscar) {

        List<WebElementFacade> listaMesesCalendario;
        boolean fechaEncontrada = false;
        LocalDateTime fechaActual = LocalDateTime.now();
        int anioActual = fechaActual.getYear();
        if (anioActual <= anioABuscar) {
            for (int i = 0; i <= 3; i++) {
                listaMesesCalendario = paginaMainMetodos.obtenerMesesCalendario();
                int posicionAnio = FechaUtileria.obtenerPosicionAnio(listaMesesCalendario, anioABuscar);
                if (posicionAnio != -1) {
                    int posicionMes = FechaUtileria.obtenerPosicionMes(listaMesesCalendario, mesABuscar);
                    if (posicionMes != -1) {
                        List<WebElementFacade> listaDiasCalendario = paginaMainMetodos.obtenerDiasCalendario(posicionMes);
                        int posicionDia = FechaUtileria.obtenerPosicionDia(listaDiasCalendario, diaABuscar);
                        if (posicionDia != -1) {
                            fechaEncontrada = true;
                            actor.attemptsTo(
                                    Click.on(listaDiasCalendario.get(posicionDia))
                            );
                            break;
                        }
                    }
                }
                actor.attemptsTo(
                        Click.on(PaginaMain.BUTTON_GO_NEXT_MONTH),
                        Click.on(PaginaMain.BUTTON_GO_NEXT_MONTH),
                        Click.on(PaginaMain.BUTTON_GO_NEXT_MONTH)
                );
            }
        } else {
            System.out.println("La fecha ingresada es menor al calendario disponible");
        }
        if (!fechaEncontrada) {
            System.out.println("La fecha ingresada esta fuera del calendario disponible");
        }
        return fechaEncontrada;
    }
}
