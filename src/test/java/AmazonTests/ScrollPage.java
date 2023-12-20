package AmazonTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollPage {

    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void verifyScrollingThePage() throws InterruptedException {
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

       JavascriptExecutor js = (JavascriptExecutor) driver;
//       vertically scroll
//       js.executeScript("window.scrollBy(0,900)");
//        Thread.sleep(3000);

        //scroll until to element

       WebElement ele = driver.findElement(By.id("myBtn"));


       js.executeScript("arguments[0].scrollIntoView();",ele);
        Thread.sleep(3000);


        //
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
