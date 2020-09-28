package com.agora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AgoraLogin {

    public WebElement loginButton;


    public WebElement modal;
    public WebElement username;
    public WebElement password;
    public WebElement loginSubmitButton;
    public WebDriver driver;



    public AgoraLogin(WebDriver driver) {
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
        this.username = this.modal.findElement(By.id("loginUsername"));
        this.password = this.modal.findElement(By.id("loginPassword"));
        this.loginSubmitButton = this.modal.findElement(By.id("loginSubmit"));
    }

    public void setUsername(String username) {
        this.username.clear();
        this.username.sendKeys(username);
    }

    public void setPassword(String password) {
        this.password.clear();
        this.password.sendKeys(password);
    }

    public void submit() {
        this.loginSubmitButton.click();
    }

    public void logout() {
        WebElement dropdown = driver.findElement(By.id("dropDownMenuButton"));
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("logout-button")).click();

    }

    public void login() {
        this.setUsername("WGNeffThree");
        this.setPassword("pass");
        this.submit();
    }

    public void loginWithoutUsername() {
        this.setPassword("pass");
        this.submit();
    }

    public void loginWithoutPassword() {
        this.setUsername("WGNeffThree");
        this.submit();
    }


    public void touchUsername() {
        this.username.click();
    }

    public void touchPassword() {
        this.password.click();
    }


    public void closeModal(boolean element_exists) {
        if(element_exists) {
            this.modal.findElement(By.id("closeModal")).click();
        }
    }
}
