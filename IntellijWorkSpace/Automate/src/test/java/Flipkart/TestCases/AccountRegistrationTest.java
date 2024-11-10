package Flipkart.TestCases;

import Flipkart.pageObjects.AccountRegistration;
import Flipkart.pageObjects.Home;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountRegistrationTest  {

    public WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.opencart.com/en-gb?route=common/home");
    }

    @Test(priority = 1)
    void verify_Account_Registration()  {
        Home hp = new Home(driver);

        hp.setMyAccount();

        hp.clickRegistration();

        AccountRegistration accReg = new AccountRegistration(driver);

        accReg.enterFirstName();

        accReg.enterLastName();
    }


    @AfterClass
    void teadDown()
    {
        if (driver != null) {
            driver.quit();
        }    }

}
