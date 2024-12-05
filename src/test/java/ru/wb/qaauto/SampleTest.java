package ru.wb.qaauto;

import org.testng.annotations.Test;
import ru.wb.qaauto.base.TestBase;

import static org.testng.Assert.assertTrue;

public class SampleTest extends TestBase {

    @Test
    public void verifyLoginButton() {
        page.navigate("https://www.saucedemo.com/");

        boolean isLoginButtonVisible = page.isVisible("[data-test='login-button']");
        assertTrue(isLoginButtonVisible, "Login Button");
    }

}
