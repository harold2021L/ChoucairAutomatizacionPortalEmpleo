package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PaginalocalizadoresEmpleo;

public class Buscar implements Task {
    public static Buscar empleo() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginalocalizadoresEmpleo.BUSCAR_OFERTA),
                Enter.theValue("choucair").into(PaginalocalizadoresEmpleo.CAJA_TEXTO_BUSCAR),
                Click.on(PaginalocalizadoresEmpleo.BUSCAR_EMPLEO),
                Click.on(PaginalocalizadoresEmpleo.APLICAR_OFERTA));
    }
}
