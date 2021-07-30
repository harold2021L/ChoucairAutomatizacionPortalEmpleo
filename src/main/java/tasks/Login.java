package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PaginalocalizadoresEmpleo;

import javax.swing.event.CaretListener;

public class Login implements Task {

    public static Login iniciarSesion() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("harold-es-1995@hotmail.com").into(PaginalocalizadoresEmpleo.CORREO),
                Enter.theValue("harold12345").into(PaginalocalizadoresEmpleo.CLAVE),
                Click.on(PaginalocalizadoresEmpleo.INICIAR_SESION));

    }
}
