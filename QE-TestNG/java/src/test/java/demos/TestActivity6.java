package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
// import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// import com.beust.jcommander.Parameter;
// import com.beust.jcommander.Parameters;
import org.testng.annotations.Parameters;


public class TestActivity6 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");

    }
    

        @Test
        @Parameters({ "user", "pass" })
        public void Test1(String user, String pass) {

            WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
            WebElement password = driver.findElement(By.id("password"));
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
