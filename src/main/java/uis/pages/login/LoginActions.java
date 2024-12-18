package uis.pages.login;

import core.driver.ElementHandler;
import models.Credentials;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginActions {


    public static void login(Credentials credentials) {
        ElementHandler.openApplication();
        ElementHandler.waitTillCondition(ExpectedConditions.elementToBeClickable(LoginPage.loginButton),100);
        ElementHandler.enterText(LoginPage.username, credentials.getUsername());
        ElementHandler.enterText(LoginPage.password, credentials.getPassword());
        ElementHandler.click(LoginPage.loginButton);
    }

    public static String getErrorMessage(){
       return ElementHandler.getElementText(LoginPage.errorMessage);
    }
}
