package SeleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.*;
import java.util.List;

public class VerifyBrokenLinks {

    WebDriver driver;
    @BeforeTest
    public void setUP()
    {
        System.setProperty("webdriver.chrome.driver","/Users/fahiezah/Desktop/2024Projects/AmazonPractise/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @Test
//    public void checkBrokenlinks() throws IOException {
//        driver.manage().window().maximize();
//        driver.get("http://www.deadlinkcity.com/");
//
//        //find all the availablw links - find with tagname 'a'
//       List<WebElement> links = driver.findElements(By.tagName("a"));
//
//       //iterating each link and checking the response status
//        for (WebElement ele:links) {
//            // take each url
//           String linkurl = ele.getAttribute("href");
//          //  Proxy proxy = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(8080));
//           //open connection - http/https
//            try {
//                URL url = new URL(linkurl.trim());
//                //mailto:novice..@gmail.com
//                if (!url.getProtocol().equals("http")) {
//                    System.out.println(linkurl + "-"+ "skipped");
//                    continue;
//                }
//                HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
//                httpURLConnection.setConnectTimeout(5000); //Set connection timeout to 3 seconds
//
//                httpURLConnection.connect();
//                if(httpURLConnection.getResponseCode() == 200)
//                {
//                    System.out.println(linkurl + "-"+ httpURLConnection.getResponseMessage());
//                }else {
//                    System.err.println(linkurl +"Broken links : "+ " - "+ httpURLConnection.getResponseCode() + " - "+ httpURLConnection.getResponseMessage());
//                }
//
//                httpURLConnection.disconnect();
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                System.out.println(linkurl + " - "+ " Host doesn't exist! ");
//            }
//        }
//    }

    @Test
    public void verifyBrokenLinks() throws IOException {

        driver.get("http://www.deadlinkcity.com/");

      List<WebElement> urlLinks =  driver.findElements(By.tagName("a"));

        for(WebElement ele :urlLinks) {
           String links = ele.getAttribute("href");

           URL url = new URL(links.trim());  // trim spacing

           if(!url.getProtocol().equals("http"))
           {
               System.out.println(links + " skipped");
               continue;
           }
           try{
               HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
               httpURLConnection.setConnectTimeout(3000);
               httpURLConnection.connect();
               if(httpURLConnection.getResponseCode() == 200)
               {
                   System.out.println(url + " - " + httpURLConnection.getResponseMessage());
               }else
               {
                   System.err.println(url + " - "+httpURLConnection.getResponseMessage()+" : " + httpURLConnection.getResponseCode());
               }

           }catch (Exception e)
           {
               System.out.println(e.getStackTrace());
               System.out.println(e.getMessage());
           }

        }
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
