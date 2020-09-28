package com.agora.HomePageTests;

import com.agora.pages.AgoraLogin;
import com.agora.pages.AgoraRegistration;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class RegistrationTest {

    private AgoraRegistration agoraRegistration;
    private static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Before
    public void setUp() {
        this.agoraRegistration = new AgoraRegistration(driver);
    }

    @After
    public void tearDown() {


        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

    }

    @AfterClass
    public static void tearDownAfterClass() {

    }


    @Test
    public void testUnableToRegisterWithoutEverything() {

        agoraRegistration.registrationSubmitButton.click();

        boolean element_exists = agoraRegistration.modal.isDisplayed();

        assertTrue(element_exists);

        agoraRegistration.closeModal(element_exists);

    }
}
