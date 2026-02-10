package stepDefinations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity4Steps extends Base{
    // @Test
    @Given("the user is on the login page")
    public void getpaging(){
        
        driver.get("https://training-support.net/webelements/login-form/");
        
    }
    // @When("the user enters {string} and {string}")
    // public void findingelement(String username,String password){
    //     driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
    //     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

    // }
    // @And("clicks the submit button")
    // public void clicking(){
    //     driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/form/button")).click();
    // }
    @Then("get the confirmation messsage  as {string}")
    public void msg(String m){
        WebElement msg=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div/h2"));
        Assertions.assertEquals(msg.getText(),m);
        
    }
    
}
