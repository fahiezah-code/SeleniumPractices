package SeleniumPractiseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsTabsHandles {
    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void verifyWinddowTabs()
    {
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //print current window Title;
        String HomeTitle = driver.getTitle();
        System.out.println("This is first tab" + HomeTitle + ": " + driver.getWindowHandle());


        driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();

       String HotelpageTitle = driver.getTitle();
       System.out.println("This is second tab" + HotelpageTitle +": " + driver.getWindowHandle());

        //find windows
        Set<String> handles = driver.getWindowHandles();

        Iterator it = handles.iterator();

        String parentid = (String) it.next();
        String childid = (String) it.next();
        //print out all windows
//        while (it.hasNext()) {
//             System.out.println(it.next());}

        //switch new window/tab
        driver.switchTo().window(childid);

        driver.findElement(By.xpath("//a[@title='Bus Tickets']")).click();
       String BusPageTitle =  driver.getTitle();
        System.out.println("This is third page title " + BusPageTitle + ": " + driver.getWindowHandle());
    }

    @Test
    public void findTextfromNewWindow() throws InterruptedException {
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();

        //open new tab from below element
        driver.findElement(By.id("selenium143")).click();

        //open new window from below element
        driver.findElement(By.linkText("Open a popup window")).click();
        Thread.sleep(5000);

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windows: windowHandles) {
            driver.switchTo().window(windows);
            try {
                String newwindowText = driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText();
                System.out.println("Text from new window" + newwindowText);
                break;
            }catch (NoSuchElementException e){
                System.out.println(e);
                driver.close();
            }
        }





    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
