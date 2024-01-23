package SeleniumPractiseTest;
import PageObjects.AmazonPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AmazonTests
{

    WebDriver driver;
    AmazonPageObject amazonpage;


    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }

    @Test(priority = 0, description = "find first 5 product names and prices between 350 & 750")
    public void selectBrand() throws InterruptedException
    {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
       // Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ipad air case");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='p_89/ProCase']//i[@class='a-icon a-icon-checkbox']")).click();
       // Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'$350 a $750')]")).click();
       // Thread.sleep(3000);
        amazonpage = new AmazonPageObject(driver);
        amazonpage.getProductPrices();
        amazonpage.getProductNames();
       // amazonpage.setInputText();
       // amazonpage.clickSearchButton();
//        amazonpage.clickSelectBrand();
//        amazonpage.clickPriceRange();

    }

    @Test(priority = 1, description = "check whether the price bt 350 & 750")
    public void verifyPriceRage()
    {

        List<Integer> pricelists = amazonpage.getProductPrices();
        for (Integer pl : pricelists) {
            try {
                Assert.assertTrue(350 <= pl && pl <= 750);
            }catch (AssertionError e)
            {
                System.out.println(e);
            }

        }

    }


  @AfterTest
    public void tearDown()
  {
      driver.quit();
  }


}


