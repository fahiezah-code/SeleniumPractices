package SeleniumPractise;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
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
        Files.copy(f.toPath(), new File("/Users/fahiezah/Desktop/2024Projects/AmazonPractise/src/test/java/Utils/amazontest.png").toPath());
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
