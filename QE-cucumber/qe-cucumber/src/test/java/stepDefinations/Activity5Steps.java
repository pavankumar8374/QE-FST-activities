package stepDefinations;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class Activity5Steps extends Base {
    @When("the user enters {string} and {string}")
    public void findingelement(String username,String password){
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);

    }
}
