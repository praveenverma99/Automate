package Flipkart.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{



    public Home(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//span[normalize-space()='My Account']")
    WebElement MyAccount;

    @FindBy(xpath="//a[normalize-space()='Register']")
    WebElement Registration;

    public void setMyAccount()
    {

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", MyAccount);

    }

    public void clickRegistration()
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Registration);
    }

}
