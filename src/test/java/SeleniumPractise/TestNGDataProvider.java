package SeleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

    WebDriver driver;
    @BeforeTest
    public  void setUp()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver" );
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "dataSupport") // here mention dataProvider name
    public void verifyLogin(String username, String password)
    {
        System.out.println("Username is : "+username + " and " +"Password is : "+ password);
    }

    @DataProvider(name = "dataSupport") //can add any name to DataProvider attribute
    public Object[][] dataSuplply()
    {
        Object[][] data = {{"testdata1","1234"},{"testdata3","4567"},{"testdata1","8920"}};
        return data;

    }


   @AfterTest
   public void tearDown()
   {
       driver.quit();
   }

}
