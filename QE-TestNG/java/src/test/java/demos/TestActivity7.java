package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");

    }

    
    @DataProvider(name="Authentication")

    public static Object[][] credentials(){
        return new Object[][]{
            {"admin","password"},
            {"admin","password"},
            {"admin","password"}
        };
    }



    @BeforeMethod
    public void loadPage(){
        driver.get("https://training-support.net/webelements/login-form/");
}


    @Test(dataProvider = "Authentication")
    public void Test1(String user, String pass) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement username = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("username"))
    );
             WebElement password = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("password"))
    );
            WebElement button = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button"));
            
            // username.;
            username.sendKeys(user);
            password.sendKeys(pass);
            button.click();

            Assert.assertEquals(user, "admin");   // only if admin is expected
        }


    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
