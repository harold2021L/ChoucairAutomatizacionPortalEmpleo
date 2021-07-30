package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginalocalizadoresEmpleo {
    public static final Target CORREO = Target.the("correo de usuario").located(By.id("emailSignIn"));
    public static final Target CLAVE = Target.the("password").located(By.id("emailSignInConfirm"));
    public static final Target INICIAR_SESION =Target.the("Iniciar sesion").located(By.id("btnSubmitLogin"));
    public static final Target BUSCAR_OFERTA = Target.the("buscar oferta").located(By.xpath("//a[@href='/es/empleos/'][contains(.,'Ofertas laborales')]")) ;
    public static final Target CAJA_TEXTO_BUSCAR = Target.the("Buscar oferta").located(By.xpath("//*[@id=\"filterrific_filter\"]/input[2]")) ;
    public static final Target BUSCAR_EMPLEO = Target.the("bscar empleo").located(By.xpath("//*[@id=\"filterrific_filter\"]/input[3]"));
    public static final Target APLICAR_OFERTA = Target.the("aplicar oferta").located(By.xpath("//*[@id=\"apply-vacant\"]"));
}
