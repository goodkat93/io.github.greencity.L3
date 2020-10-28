package io.github.greencity.l3.tests;

import io.github.greencity.l3.pages.LoginPage;
import io.github.greencity.l3.runner.Runner;
import org.testng.annotations.Test;

public class GreenCityTestUserName extends Runner {
    @Test(priority = 2)
    public void TestUsername() {
        new LoginPage(driver)
                .open()
                .clickAgain()
                .setUserName("PrivetPoka")
                .testUserName()
                .setUserName1("ggg")
                .testUserName1()
                .setUserName2("@#%@#^@#^")
                .testUserName2();
    }
}
