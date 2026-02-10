package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActivity9 {
    WebDriver driver;
    @BeforeClass(alwaysRun=true)
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts/");

    }

@BeforeMethod
public void loadPage(){
        driver.get("https://training-support.net/webelements/alerts/");
}

@Test
public void Testsimple(){
    WebElement button=driver.findElement(By.xpath("//*[@id=\"simple\"]"));
    button.click();
    Alert alert=driver.switchTo().alert();
    String alerttext=alert.getText();
    System.out.println(alerttext);
    
    alert.accept();
    button.click();
    alert.dismiss();

}
@Test
public void Testconfirm(){
    WebElement button=driver.findElement(By.xpath("//*[@id=\"confirmation\"]"));
    button.click();
    Alert alert=driver.switchTo().alert();
    
    System.out.println(alert.getText());
    alert.accept();
    button.click();
    alert.dismiss();

   
}
@Test
public void Testprompt(){
    WebElement button=driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
    button.click();
    Alert alert=driver.switchTo().alert();
    // String alerttext=alert.getText();
    alert.accept();
    button.click();
    alert.dismiss();
    
}


    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
