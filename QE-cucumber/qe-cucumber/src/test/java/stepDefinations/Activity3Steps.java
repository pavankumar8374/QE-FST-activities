package stepDefinations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Activity3Steps extends Base {
    Alert alert1;
    Alert alert2;
    @Given("User is on the page")
    
    public void onpage(){
        driver.get("https://training-support.net/webelements/alerts");
    }
    @When("user clicks the prompt alert button")
    public void clicking1(){
        driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
    }
    @Then("alert opens")
    public void alertopen(){
        alert1=driver.switchTo().alert();
       
        
       
    }
    @And("Read the text from it and print it")
    public void readtext(){
        System.out.println(alert1.getText());

    }
    @And("write a custom message in it")
    public void custominput(){
        alert1.sendKeys("hi");
        alert1.accept();
    }
    @And("close the alert")
    public void clalert(){
        driver.findElement(By.xpath("//*[@id=\"prompt\"]")).click();
        alert2=driver.switchTo().alert();

        alert2.dismiss();
    }
    @And("read the result text")
    public void res(){
        System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
    }
}
