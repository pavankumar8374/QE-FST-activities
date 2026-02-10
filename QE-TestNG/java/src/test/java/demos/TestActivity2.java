package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity2 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");

    }


    @Test
    public void Testmethod1(){
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }
    @Test
    public void Testmethod2(){
        WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Black')]"));
        Assert.assertEquals(button.getText(), "Black");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    
}
