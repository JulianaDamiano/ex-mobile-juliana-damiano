package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class LoginScreen extends PageObject {

    @AndroidFindBy( xpath="//android.widget.EditText[@content-desc=\"test-Usuario\"]")
    private WebElement userInput;

    @AndroidFindBy( xpath="//android.widget.EditText[@content-desc=\"test-Contraseña\"]")
    private WebElement passInput;

    @AndroidFindBy(xpath ="//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement logButton;

    public void typeUser(String user){
        userInput.sendKeys(user);

    }
    public void typePass(String pass){

        passInput.sendKeys(pass);
    }

    public void login (){
        logButton.click();
    }
}
