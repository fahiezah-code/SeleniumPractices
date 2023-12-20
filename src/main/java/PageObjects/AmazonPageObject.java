package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonPageObject {
    WebDriver driver;

    //find locators
    By searchBox = By.id("twotabsearchtextbox");
    By searchBttn   = By.id("nav-search-submit-button");
    By selectBrand = By.xpath("//li[@id='p_89/ProCase']//i[@class='a-icon a-icon-checkbox']");
    By priceRage =By. xpath("//span[contains(text(),'$350 a $750')]");

    //get productprices, productNames
    String prices = "span.a-price-whole";
    //String productNames = "//font[contains(text(),'ProCase Case ')]";
    String productNames  = "a-size-base-plus";

    public AmazonPageObject(WebDriver driver)
    {
        this.driver = driver;
    }


    public void setInputText()
    {
        driver.findElement(searchBox).sendKeys("ipad air case");
    }
    public void clickSearchButton()
    {
        driver.findElement(searchBttn).click();
    }
    public void clickSelectBrand()
    {
        driver.findElement(selectBrand).click();
    }
    public void clickPriceRange()
    {
        driver.findElement(priceRage).click();
    }

    public List<Integer> getProductPrices() {
        List<WebElement> webElementList = driver.findElements(By.cssSelector(prices));
        List<WebElement> first5PriceLists = new ArrayList<>(webElementList.subList(0,5));
        List<Integer> productPricelist = new ArrayList<>();

        for(WebElement webElement: first5PriceLists)
        {

           productPricelist.add(Integer.parseInt(webElement.getText()));

        }
        Collections.sort(productPricelist);
        System.out.println("first 5 prices " +productPricelist );

        return productPricelist;
    }

    public List<String> getProductNames()
    {
        List<WebElement> webElementList = driver.findElements(By.className(productNames));
        List<WebElement> first5ProductNames = new ArrayList<>(webElementList.subList(0,5));
        List<String> productNameLists = new ArrayList<>();
        for (WebElement web:first5ProductNames) {
            productNameLists.add(web.getText());
        }
        for (String e:productNameLists) {
            System.out.println(e);
        }
        return productNameLists;
    }







}
