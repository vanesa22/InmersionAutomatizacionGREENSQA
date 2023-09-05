package com.GreenSQA.steps;

import com.GreenSQA.exceptions.GeneralExcepcion;
import com.GreenSQA.model.DatosVuelo;
import com.GreenSQA.questions.EncontroVuelodisponible;
import com.GreenSQA.tasks.AgregarInformacionVuelo;
import com.GreenSQA.tasks.CambiarPestania;
import com.GreenSQA.tasks.SeleccionarVuelo;
import com.GreenSQA.userinterfaces.PaginaInicial;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuscarVueloStepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("^Vanesa esta en la pagina de inicio de Latam Airlines$")
    public void vanesaEstaEnLaPaginaDeInicioDeLatamAirlines() {
        theActorCalled("Vanesa").wasAbleTo(Open.browserOn(new PaginaInicial()));

    }

    @When("^Ella ingresa los siguientes detalles de la reserva$")
    public void ellaIngresaLosSiguientesDetallesDeLaReserva(List<DatosVuelo> datosVuelo) {
        theActorInTheSpotlight().attemptsTo(AgregarInformacionVuelo.AgregarInformacionVuelo(datosVuelo.get(0)));
        theActorInTheSpotlight().attemptsTo(new CambiarPestania());

    }

    @Then("^deberia ver una lista de vuelos disponibles para el destino y las fechas especificadas$")
    public void deberiaVerUnaListaDeVuelosDisponiblesParaElDestinoYLasFechasEspecificadas() {
        theActorInTheSpotlight().should(seeThat(EncontroVuelodisponible.EncontroVuelodisponible()).orComplainWith(GeneralExcepcion.class, "No se encontraron vuelos disponibles"));

        theActorInTheSpotlight().attemptsTo(new SeleccionarVuelo());

        theActorInTheSpotlight().should(seeThat(EncontroVuelodisponible.EncontroVuelodisponible()).orComplainWith(GeneralExcepcion.class, "No se encontraron vuelos disponibles"));

    }


}
