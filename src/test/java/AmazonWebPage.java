import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonWebPage {

    private WebDriver driver;
    // Method to initialize WebDriver and navigate to the Amazon login page before each test

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","F://Intelij selenium projects//Workshop_project//src//test//resources//dirvers//chromedriver.exe");
        driver = new ChromeDriver();
        // Wait of 10 seconds to handle element synchronization issues
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

    }

    @Test
    public void successfulSearch(){
        // Find the search box by its ID
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        // Enter the search query
        searchBox.sendKeys("Iphone 13");
        //searchBox.submit();

        // Click the search button using XPath
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]")).click();
        // Click on the product link using link text
        driver.findElement(By.linkText("iPhone 13 Pro, 256GB, Graphite - Unlocked (Renewed Premium)")).click();
        // Locate the quantity dropdown by its ID
        Select quantity =  new Select(driver.findElement(By.id("quantity")));
        quantity.selectByIndex(1);
        // Click Add to cart button using Xpath
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
        // Click proceed to checkout button  sing Xpath
        driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
    }


//    @AfterMethod
//    public void teardown(){
//
//        driver.quit();
    }


