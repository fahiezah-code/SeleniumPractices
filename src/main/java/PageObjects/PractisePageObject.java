package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.List;

public class PractisePageObject {

    WebDriver driver;
    //List<WebElement> Locators

    private final String Product_Names_ClassName = "a-size-base-plus";
    private final String Product_Prices_ClassName = "a-price-whole";
    private final String Product_Ranking_xpath = "(//div[@class='a-row a-size-small'] /span)";

    //find By Locators
    By searchbox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-text");
    By checkBox = By.linkText("ProCase");
    By priceRange = By.xpath("//span[contains(text(),'$350 a $750')]");


    public PractisePageObject(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setInputText(String productName)
    {
        driver.findElement(searchbox).sendKeys(productName);
    }

    public void clickSearchButton()
    {
        driver.findElement(searchButton).click();
    }

    public void clickCheckbox()
    {
        driver.findElement(checkBox).click();
    }

    public void clickPriceRange()
    {
        driver.findElement(priceRange).click();
    }

    public List<String> getProductNames()
    {
        List<WebElement> webElementList = driver.findElements(By.className(Product_Names_ClassName));
        List<WebElement> first5ProductNames = new ArrayList<WebElement>(webElementList.subList(0,5));
        List<String> ProductNameLists = new ArrayList<>();
        for (WebElement e:first5ProductNames)
        {
            ProductNameLists.add(e.getText());
        }
        return ProductNameLists;
    }

    public List<Integer> getProductPrices()
    {
        List<WebElement> webElementList = driver.findElements(By.className(Product_Prices_ClassName));
        List<WebElement> first5Prices = new ArrayList<>(webElementList.subList(0,5));
        List<Integer> ProductPriceLists = new ArrayList<>();
        for (WebElement e : first5Prices)
        {
            ProductPriceLists.add(Integer.parseInt(e.getText()));
        }
        return ProductPriceLists;
    }

    public List<Float> getProductRanking()
    {
        List<WebElement> ProductsRanking = driver.findElements(By.xpath(Product_Ranking_xpath));
        List<WebElement> first5RankingLists = new ArrayList<>(ProductsRanking.subList(0,5));
        List<Float> ProductRankingLists = new ArrayList<>();
        for (WebElement e : first5RankingLists) {
            String label = e.getAttribute("aria-label");
            if (label.contains("estrellas")) {
                ProductRankingLists.add(Float.parseFloat(label.substring(0,3)));
            }
        }
        return ProductRankingLists;
    }

    public void displayFirst5Products()
    {
        List<String> firstProductName = this.getProductNames();
        int i = 1;
        for (String name : firstProductName)
        {
            System.out.println("Product Name#"+ i + ": "+ name);
            i++;
        }
    }

    public void displayFirstProductPrices()
    {
        List<Integer> PriceLists = this.getProductPrices();
        int i = 1;
        for (Integer price : PriceLists) {
            System.out.println( "Product price" + i + ": $" +price);
            i++;
        }
    }
    public void displayFirstProductRanking()
    {
        List<Float> RankingLists = this.getProductRanking();
        int i = 1;
        for (Float rank : RankingLists)
        {
            System.out.println("Product Ranking " + i + ": " +rank);
            i++;
        }
    }

}
