import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Flipkart {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone");

        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys(Keys.ENTER);


        String searchResult1 = driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 (Black, 128 GB)']")).getText();

        String searchResult2 = driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 (Green, 128 GB)']")).getText();

        System.out.println("First search result: " +searchResult1);
        System.out.println("Second Search result " + searchResult2);

        System.out.println(searchResult1.equalsIgnoreCase("Apple iPhone 15 (Black, 128 GB)"));
        System.out.println(searchResult1.equals(searchResult2));

        driver.quit();

    }
}
