package SeleniumPractise;

import PageObjects.PractisePageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPractiseTests {
    WebDriver driver;
    PractisePageObject praPage;

    private final String ChromeDriver = "webdriver.chrome.driver";
    private final String ChromeDriver_path = "/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver";
    private final String Url = "https://www.amazon.com.mx";
    private final String search_product = "ipad air case";

    @BeforeTest
    public void setUp()
    {
        System.setProperty(ChromeDriver, ChromeDriver_path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void findProducts() throws InterruptedException
    {
        praPage = new PractisePageObject(driver);
        Thread.sleep(7000);
        praPage.setInputText(search_product);
        praPage.clickSearchButton();
        Thread.sleep(3000);
        praPage.clickCheckbox();
        Thread.sleep(3000);
        praPage.clickPriceRange();
        praPage.getProductNames();
        praPage.getProductPrices();
        System.out.println(praPage.getProductRanking());
        praPage.displayFirst5Products();
        praPage.displayFirstProductPrices();
        praPage.displayFirstProductRanking();

    }


}
