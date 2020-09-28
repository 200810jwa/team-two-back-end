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
        this.registrationToggleButton.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        this.firstName = this.modal.findElement(By.id("registrationFirstname"));
        this.lastName = this.modal.findElement(By.id("registrationLastname"));
        this.username = this.modal.findElement(By.id("registrationUsername"));
        this.password = this.modal.findElement(By.id("registrationPassword"));
        this.email = this.modal.findElement(By.id("registrationEmail"));
        this.registrationSubmitButton = this.modal.findElement(By.id("registrationSubmitButton"));
    }



    public void setFirstName(String firstName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void setEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void closeModal(boolean element_exists) {
        if(element_exists) {
            this.modal.findElement(By.id("closeModal")).click();
        }
    }

}
