package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class InventoryScreen  extends PageObject {

    @AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc=\"test-Zona de caída del carrito de compras\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement textFind;

    public String getResultText(){
        return textFind.getText();
    }
}
