package uis.pages.login;

import org.openqa.selenium.By;

public class LoginPage {


    public static final By username = By.id("user-name");
    public static final By password = By.id("password");
    public static final By loginButton = By.id("login-button");
    public static final By errorMessage = By.xpath("//h3[@data-test='error']");
}
