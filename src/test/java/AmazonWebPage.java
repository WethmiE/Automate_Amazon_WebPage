import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonWebPage {

    private WebDriver driver;
    // Method to initialize WebDriver and navigate to the Guru99 login page before each test

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","F://Intelij selenium projects//Workshop_project//src//test//resources//dirvers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Iphone X");
        //searchBox.submit();
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]")).click();
    }

    @Test
    public void successfulLogin(){


    }

//    @AfterMethod
//    public void teardown(){
//
//        driver.quit();
    }


