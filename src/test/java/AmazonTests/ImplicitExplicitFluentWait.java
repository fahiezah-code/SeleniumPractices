package AmazonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ImplicitExplicitFluentWait {
    WebDriver driver;

    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyWaits() {
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
// implicit wait = global, it is applicable for all elements on the page.
// it will wail if the elements require to be visible
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.findElement(By.className("dropbtn")).click();
//        driver.findElement(By.linkText("Flipkart")).click();

        // Explicit wait --> create obj for WebdriverWait,

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
        driver.findElement(By.className("dropbtn")).click();
        WebElement ele =wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
        ele.click();



    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
