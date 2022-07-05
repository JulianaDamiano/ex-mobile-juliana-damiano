package com.nttdata.steps;


import com.nttdata.screens.InventoryScreen;
import com.nttdata.screens.LoginScreen;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginScreen loginScreen;
    InventoryScreen inventorySreen;

    @Step("Ingresar usuario y contraseña")
    public void logearse(String user, String pass) {
        loginScreen.typeUser(user);
        loginScreen.typePass(pass);


    }

    public void botonLog() {
        loginScreen.login();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return inventorySreen.getResultText();
    }



}
