package io.github.greencity.l3.tests;

import io.github.greencity.l3.pages.LoginPage;
import io.github.greencity.l3.runner.Runner;
import org.testng.annotations.Test;

public class GreenCityTestEmail extends Runner {

    @Test(priority = 1)
    public void TestEmail() {

        new LoginPage(driver)
                .open()
                .clickSignUp()
                .setEmail("blabla@mail.com")
                .testEmail()
                .setEmail1("1@3$5^")
                .testEmail1()
                .setEmail2("")
                .testEmail2();
    }
}