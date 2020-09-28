package com.agora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AgoraRegistration {

    public WebElement loginButton;


    public WebElement modal;
    public WebElement firstName;
    public WebElement lastName;
    public WebElement username;
    public WebElement password;
    public WebElement email;
    public WebElement registrationSubmitButton;
    public WebDriver driver;
    public WebElement registrationToggleButton;


    public AgoraRegistration(WebDriver driver) {
        super();
        this.driver = driver;
        this.driver.get("http://localhost:4200/landing");

        this.loginButton = this.driver.findElement(By.id("login-link"));
        getModal();
    }


    public void getModal() {
        loginButton.click();
        this.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        this.modal = driver.findElement(By.id("homePageModal"));
        this.registrationToggleButton = driver.findElement(By.id("toggleToRegistration"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        this.firstName = this.modal.findElement(By.id("registrationFirstname"));
        this.lastName = this.modal.findElement(By.id("registrationLastname"));
        this.username = this.modal.findElement(By.id("registrationUsername"));
        this.password = this.modal.findElement(By.id("registrationPassword"));
        this.email = this.modal.findElement(By.id("registrationEmail"));
        this.registrationSubmitButton = this.modal.findElement(By.id("registrationSubmitButton"));
    }

}
