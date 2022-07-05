package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;

public class LoginStepsDef {

    LoginStep loginStep;


    @Dado("que me encuentro en la app de login de SwagLabs")
    public void que_me_encuentro_en_la_app_de_login_de_swag_labs() {

    }
    @Cuando("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String user, String pass) {
        loginStep.logearse(user,pass);
        loginStep.botonLog();
    }
    @Entonces("valido que debería aparecer titulo de {string}")
    public void valido_que_debería_aparecer_titulo_de(String text) {

            Assert.assertEquals(loginStep.getResultText(), text);

    }
    @Y("tambien valido que al menos exista un item")
    public void tambien_valido_que_al_menos_exista_un_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
