package io.github.greencity.l3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) { this.driver = driver; }

    public LoginPage open(){
        driver.get("https://ita-social-projects.github.io/GreenCityClient");
        driver.manage().window().maximize();
        return this;
    }
    public LoginPage clickSignUp(){
        driver.findElement(By.xpath("/html/body/app-root/app-header/div/div/div/div[2]/div[2]/ul/li[4]/div"))
                .click();
        return this;
    }
    public LoginPage setEmail(String email) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[1]"))
                .sendKeys(email);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return this;
    }
    public LoginPage testEmail() {
        driver.findElements(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div"));
        String pageSource = driver.getPageSource();
        Assert.assertFalse(pageSource.contains("error-message ng-star-inserted"));
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[1]")).clear();
        return this;
    }
    public LoginPage setEmail1(String email) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[1]"))
                .sendKeys(email);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return this;
    }
    public LoginPage testEmail1() {
        driver.findElements(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div"));
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("error-message ng-star-inserted"));
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[1]")).clear();
        return this;
    }

    public LoginPage setEmail2(String email) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[1]"))
                .sendKeys(email);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return this;
    }
    public LoginPage testEmail2() {
        driver.findElement(By.xpath("//input[@id='firstName']"))
                .click();
        driver.findElement(By.xpath("//input[@id='email']"))
                .click();
        driver.findElements(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div"));
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("error-message ng-star-inserted"));
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-auth-modal[1]/div[1]/div[1]/div[2]/a[1]/img[1]")).click();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        return this;
    }

    public LoginPage clickAgain() {
        driver.findElement(By.xpath("//app-header/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/div[1]"))
                .click();
        return this;
    }

    public LoginPage setUserName(String UserName) {
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/app-auth-modal/div/div/div[2]/div/app-sign-up/div/form/div/input[2]"))
                .sendKeys(UserName);
        return this;
    }

    public LoginPage testUserName() {
        driver.findElement(By.xpath
                ("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-auth-modal[1]/div[1]/div[1]/div[2]/div[1]/app-sign-up[1]/div[1]/form[1]/div[1]/div[1]"));
        String pageSource = driver.getPageSource();
        Assert.assertFalse(pageSource.contains("error-message ng-star-inserted"));
        driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        return this;
    }

    public LoginPage setUserName1(String UserName) {
        driver.findElement(By.xpath("//input[@id='firstName']"))
                .sendKeys(UserName);
        return this;
    }

    public LoginPage testUserName1() {
        driver.findElement(By.xpath
                ("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-auth-modal[1]/div[1]/div[1]/div[2]/div[1]/app-sign-up[1]/div[1]/form[1]/div[1]/div[1]"));
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("error-message ng-star-inserted"));
        driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        return this;
    }
    public LoginPage setUserName2(String UserName) {
        driver.findElement(By.xpath("//input[@id='firstName']"))
                .sendKeys(UserName);
        return this;
    }

    public LoginPage testUserName2() {
        driver.findElement(By.xpath
                ("//body/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-auth-modal[1]/div[1]/div[1]/div[2]/div[1]/app-sign-up[1]/div[1]/form[1]/div[1]/div[1]"));
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("error-message ng-star-inserted"));
        return this;
    }


}

