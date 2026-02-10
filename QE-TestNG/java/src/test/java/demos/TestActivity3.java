package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");

    }
    @Test
    public void Testmethod1(){
        WebElement in1=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement in2=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        in1.sendKeys("admin");
        in2.sendKeys("password");
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
        Assert.assertEquals(driver.getTitle(), "Selenium: Login Success!");

    }




    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
