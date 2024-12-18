package e2e.login;

import e2e.TestBase;
import models.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import uis.pages.login.LoginActions;

public class TestLogin extends TestBase {

    @Test
    public void testValidCredentials() {
        LoginActions.login(Credentials.getValidCredentials());
    }

    @Test
    public void testUsernameOnly() {
        LoginActions.login(Credentials.getCredentialsOnyUsername());
        Assert.assertEquals(LoginActions.getErrorMessage(), TestLoginHelper.Error_Username_Only);
    }

    @Test
    public void testPassword() {
        LoginActions.login(Credentials.getCredentialsOnyPassword());
        Assert.assertEquals(LoginActions.getErrorMessage(), TestLoginHelper.Error_Password_Only);
    }

    @Test
    public void testNotExistingLogin() {
        LoginActions.login(Credentials.getNotExisingCredentials());
        Assert.assertEquals(LoginActions.getErrorMessage(), TestLoginHelper.Error_Not_Existing_Credentials);
    }
}
