package com.agora.HomePageTests;

import com.agora.pages.AgoraLogin;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class LoginTest {

    private AgoraLogin agoraLogin;
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before
    public void setUp(){
        this.agoraLogin = new AgoraLogin(driver);
    }

    @After
    public void tearDown() {


        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void tearDownAfterClass() {

    }

    @Test
    public void testSuccessfulLogin() {
        agoraLogin.login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean element_exists = driver.findElement(By.id("dropdown-menu")).isDisplayed();

        assertTrue(element_exists);
        agoraLogin.logout();


//        wait.until(ExpectedConditions.invisibilityOf(agoraLogin.loginButton));
    }

    @Test
    public void testUnsuccessfulLoginWithWrongPassword() {
        agoraLogin.setUsername("WGNeffThree");
        agoraLogin.setPassword("wrongPassword");
        agoraLogin.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean element_exists = agoraLogin.modal.isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);
//        wait.until(ExpectedConditions.invisibilityOf(agoraLogin.loginButton));
    }

    @Test
    public void testUnsuccessfulLoginWithWrongUsername() {
        agoraLogin.setUsername("WGNeffThreeWrong");
        agoraLogin.setPassword("pass");
        agoraLogin.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean element_exists = agoraLogin.modal.isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);
//        wait.until(ExpectedConditions.invisibilityOf(agoraLogin.loginButton));
    }

    @Test
    public void testUnsuccessfulLoginWithWrongUsernameAndWrongPassword() {
        agoraLogin.setUsername("WGNeffThreeWrong");
        agoraLogin.setPassword("WrongPassword");
        agoraLogin.submit();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        boolean element_exists = agoraLogin.modal.isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);
//        wait.until(ExpectedConditions.invisibilityOf(agoraLogin.loginButton));
    }

    @Test
    public void testRedirectBackToLandingFromPublishWhenNotLoggedIn() {
        driver.get("http://localhost:4200/publish");

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        assertEquals("http://localhost:4200/landing", driver.getCurrentUrl());
    }

    @Test
    public void testNoRedirectBackToLandingFromPublishWhenLoggedIn() {
        agoraLogin.login();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("dropDownMenuButton"));
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("publish-article-button")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        assertEquals("http://localhost:4200/publish", driver.getCurrentUrl());
        agoraLogin.logout();
    }

    @Test
    public void testRedirectToLandingFromPublishWhenLoggedOut() {
        agoraLogin.login();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("dropDownMenuButton"));
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("publish-article-button")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        agoraLogin.logout();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        assertEquals("http://localhost:4200/landing", driver.getCurrentUrl());
    }

    @Test
    public void testRedirectBackToLandingFromPublishWhenLoggedInAfterClickingTitleButton() {
        agoraLogin.login();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("dropDownMenuButton"));
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("publish-article-button")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("title-button")).click();
        driver.manage().timeouts().implicitlyWait( 1, TimeUnit.SECONDS);
        assertEquals("http://localhost:4200/landing", driver.getCurrentUrl());
        agoraLogin.logout();
    }

    @Test
    public void testUnableToLoginWithoutUsername() {
        agoraLogin.loginWithoutUsername();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        boolean element_exists = agoraLogin.modal.isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);

    }


    @Test
    public void testUnableToLoginWithoutPassword() {
        agoraLogin.loginWithoutPassword();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        boolean element_exists = agoraLogin.modal.isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);

    }

    @Test
    public void testErrorMessageOnTouchingLogin() {
        agoraLogin.touchUsername();
        agoraLogin.touchPassword();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        boolean element_exists = agoraLogin.modal.findElement(By.id("usernameError")).isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);
    }

    @Test
    public void testErrorMessageOnTouchingPassword() {
        agoraLogin.touchPassword();
        agoraLogin.touchUsername();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        boolean element_exists = agoraLogin.modal.findElement(By.id("passwordError")).isDisplayed();

        assertTrue(element_exists);

        agoraLogin.closeModal(element_exists);
    }
}
