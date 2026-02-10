package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class Activity9 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/keyboard-events/");
        driver.getTitle();
        
        
       actions.click(driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1"))) 
            .sendKeys("hi")
            .perform();
        driver.quit();
        
    }
}
