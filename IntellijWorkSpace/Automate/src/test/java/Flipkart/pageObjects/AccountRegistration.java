package Flipkart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class AccountRegistration extends BasePage {


    public AccountRegistration(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstName;

    @FindBy(xpath= "//label[normalize-space()='Last Name']")
    WebElement lastName;

    public void enterFirstName() {
        firstName.sendKeys("Praveen");
    }

    public void enterLastName()
    {
        lastName.sendKeys("verma");
    }

    public static class RandomNameGenerator {

        // Array of sample first names
        private static final String[] firstNames = {
                "James", "Mary", "John", "Patricia", "Robert", "Jennifer",
                "Michael", "Linda", "William", "Elizabeth", "David", "Barbara",
                "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah",
                "Charles", "Karen"
        };

        // Array of sample last names
        private static final String[] lastNames = {
                "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia",
                "Miller", "Davis", "Martinez", "Hernandez", "Lopez", "Wilson",
                "Anderson", "Thomas", "Taylor", "Moore", "Jackson", "Martin",
                "Lee", "Perez"
        };

        // Method to generate a random name
        public static String generateRandomNameFirst() {
            Random random = new Random();
            return firstNames[random.nextInt(firstNames.length)];
        }

        public static String generateRandomNameLast() {
            Random random = new Random();
            return lastNames[random.nextInt(lastNames.length)];
        }





   /*     public void enterFirstName()
        {
            String randomNameFirstname = generateRandomNameFirst();
            firstName.sendKeys(randomNameFirstname);
        } */


    }
}
