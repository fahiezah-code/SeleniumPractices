package SeleniumPractiseTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestScreenshots {

    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void checkScreenshots() throws IOException {
        driver.get("https://www.google.com/");
        //to use getScreenshotAs method, need to do Typecast to driver by using TakeScreehsot class
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //to copy to actual file, give path
        Files.copy(f.toPath(), new File("/Users/fahiezah/Desktop/2024Projects/AmazonPractise/src/test/java/Utils/amazontest1.png").toPath());

        //take specific particular screnshot(Partical)

        WebElement wb = driver.findElement(By.id("APjFqb"));
        wb.sendKeys("selenium webdriver");
        WebElement sc =driver.findElement(By.id("Alh6id"));
        File f2 = sc.getScreenshotAs(OutputType.FILE);
        Files.copy(f2.toPath(), new File("/Users/fahiezah/Desktop/2024Projects/AmazonPractise/src/test/java/Utils/partialscreenshot1.png").toPath());


    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
