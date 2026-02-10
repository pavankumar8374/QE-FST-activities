package stepDefinations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
// import io.cucumber.java.en_old.Tha;

public class Activity2Steps extends Base {
    // @Given("the user is on the login page")
    // public void getpage(){
    //     driver.get("https://training-support.net/webelements/login-form");
    // }
    
    @When("the user enters username and password")
    public void findingelement(){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");

    }
    @And("clicks the submit button")
    public void clicking(){
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
    }
   
    @Then("get the confirmation message and verify it")
    public void msg(){
        WebElement msg=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2"));
        Assertions.assertEquals(msg,"Welcome Back, Admin");
        
    }
    
}
