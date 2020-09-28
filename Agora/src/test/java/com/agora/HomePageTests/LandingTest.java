package com.agora.HomePageTests;

import com.agora.pages.AgoraHome;
import com.agora.pages.AgoraLogin;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class LandingTest {

    private AgoraHome agoraHome;
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
        this.agoraHome = new AgoraHome(driver);
    }

    @After
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void tearDownAfterClass() {

    }


    @Test
    public void checkOpenModal() {
        agoraHome.loginButton.click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement modal = driver.findElement(By.id("homePageModal"));
        boolean element_exists = modal.isDisplayed();

        assertTrue(element_exists);

        modal.findElement(By.id("closeModal")).click();
    }

    @Test
    public void checkSportsCategoryButtonRoutesCorrectly() {
        agoraHome.clickSportsCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Sports Articles", title);
        driver.findElement(By.id("title-button")).click();
    }


    @Test
    public void checkScienceCategoryButtonRoutesCorrectly() {
        agoraHome.clickScienceCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Science Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkMedicineCategoryButtonRoutesCorrectly() {
        agoraHome.clickMedicineCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Medicine Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkPoliticsCategoryButtonRoutesCorrectly() {
        agoraHome.clickPoliticsCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Politics Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkCoronavirusCategoryButtonRoutesCorrectly() {
        agoraHome.clickCoronavirusCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Coronavirus Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkBusinessCategoryButtonRoutesCorrectly() {
        agoraHome.clickBusinessCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Business Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkEconomicsCategoryButtonRoutesCorrectly() {
        agoraHome.clickEconomicsCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Economics Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkCoffeeCategoryButtonRoutesCorrectly() {
        agoraHome.clickCoffeeCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Coffee Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkEntertainmentCategoryButtonRoutesCorrectly() {
        agoraHome.clickEntertainmentCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Entertainment Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkFoodCategoryButtonRoutesCorrectly() {
        agoraHome.clickFoodCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Food Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkTechnologyCategoryButtonRoutesCorrectly() {
        agoraHome.clickTechnologyCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Technology Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkFutureCategoryButtonRoutesCorrectly() {
        agoraHome.clickFutureCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Future Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkAiCategoryButtonRoutesCorrectly() {
        agoraHome.clickAiCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Artificial intelligence Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void checkCryptocurrencyCategoryButtonRoutesCorrectly() {
        agoraHome.clickCryptocurrencyCategoryButton();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Cryptocurrency Articles", title);
        driver.findElement(By.id("title-button")).click();
    }

    @Test
    public void testSearchFunctionality() {
        agoraHome.search("Testing");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String title = driver.findElement(By.id("thirdPartyArticleListTitle")).getText();
        assertEquals("Testing Articles", title);
        driver.findElement(By.id("title-button")).click();
    }
}
