package AmazonTests;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverAction {

    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyMouseHover() throws InterruptedException {
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.id("blogsmenu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("SeleniumByArun")).click();
        Thread.sleep(3000);


    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
