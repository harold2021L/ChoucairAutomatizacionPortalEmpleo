package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Abrir;
import tasks.Buscar;
import tasks.Login;

public class StepDefininitionsEmpleo {
    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Harold nuevo aspirante ingresa usuario y clave$")
    public void haroldNuevoAspiranteIngresaUsuarioYClave() {
        OnStage.theActorCalled("harold").wasAbleTo(Abrir.lapagina(), Login.iniciarSesion());
    }

    @When("^consulta la vacantes disponible y aplica$")
    public void consultaLaVacantesDisponibleYAplica() {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.empleo());
    }

    @Then("^puede ver la oferta aplicada$")
    public void puedeVerLaOfertaAplicada() {
    }
}
