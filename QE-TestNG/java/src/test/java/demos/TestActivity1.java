package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net");
    }   
    
    @Test
    public void Testmethod1(){ 
        Assert.assertEquals(driver.getTitle(),"Training Support");
    } 

    @Test
    public void Testmethod2(){
        driver.findElement(By.linkText("About Us")).click();
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
