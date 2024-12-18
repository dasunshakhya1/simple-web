package uis.components;

import core.driver.ElementHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Header {

    private static final By crateAccountLnk = By.linkText("Create an Account");

    public static void navigateToCreateAccount() {

        ElementHandler.waitTillCondition(ExpectedConditions.elementToBeClickable(crateAccountLnk), 50);
        ElementHandler.click(crateAccountLnk);

    }
}
