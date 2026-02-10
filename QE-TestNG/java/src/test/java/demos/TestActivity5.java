package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice/");

    }


   

    @Test(groups={"header"})
    public void TestHeader(){
        String s=driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
        Assert.assertEquals(s,"Heading #3");
    }

    @Test(groups={"header"})
    public void TestHeader1(){
        String s=driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue("color");
        Assert.assertEquals(s,"rgb(147, 51, 234)");
        // Assert.assertEquals(s, "rgb(147, 51, 234)");

    }

    @Test(groups={"button"})
    public void TestButton(){
        String s=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[8]")).getText();
        Assert.assertEquals(s,"Emerald");

    }
    @Test(groups={"button"})
    public void TestButton1(){
        String s=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")).getCssValue("color");
        Assert.assertEquals(s,"rgb(88, 28, 135)");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    
}
