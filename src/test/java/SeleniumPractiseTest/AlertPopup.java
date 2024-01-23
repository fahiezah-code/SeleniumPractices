package SeleniumPractiseTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertPopup {
    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyTextofAlert()
    {
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("alert1")).click();
        Alert alert = driver.switchTo().alert();

        String alertActualtext = alert.getText();
        String alertExpectedText = "Hello";
        Assert.assertEquals(alertActualtext,alertExpectedText);
        alert.accept();

    }


    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
