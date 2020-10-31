package io.github.greencity.l3.tests;

import io.github.greencity.l3.pages.LoginPage;
import io.github.greencity.l3.runner.Runner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GreenCityTestEmail extends Runner {

    @DataProvider(name = "emailDataProvider")
    public Object[][] emailDataProvider() {
        return new Object[][] {
                { "easdasf" ,"The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.)"},
                { "fasf@", "The name must contain 6-30 characters and can contain letters(a-z), numbers(0-9) and a dot(.)"},
        };
    }

        @Test(dataProvider = "emailDataProvider")
        public void verifyData1(String email, String errMsg) {
            new LoginPage(driver)
                    .open()
                    .clickSignUp()
                    .setEmail(email)
                    .testEmail();

            Assert.assertEquals(driver.findElement(By.cssSelector("app-error>div")).getText(), errMsg);
        }

    @Test()
    public void TestEmaiSecondTest() {

        new LoginPage(driver)
                .open()
                .clickSignUp()
                .testEmail()
                .setEmail1("1@3$5^")
                .testEmail();
    /*
                .setEmail2("")
                .testEmail2();*/
    }
}