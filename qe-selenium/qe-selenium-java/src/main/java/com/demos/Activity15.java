package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity15 {
    public static void main(String[] args) {
        FirefoxDriver driver =new FirefoxDriver();
        Actions actions = new Actions(driver);
        driver.get("https://training-support.net/webelements/dynamic-attributes/");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[starts-with(@type,'text')]")).sendKeys("pavan");
        driver.findElement(By.xpath("//input[starts-with(@type,'email')]")).sendKeys("pavan@gmail.com");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2026-04-22");
        driver.findElement(By.xpath("//textarea[contains(@id,'-additional-details-')]")).sendKeys("1221-12-12");



        // driver.findElement(By.xpath("//*[@id=\"full-name-6094\"]")).sendKeys("pavan");
        // driver.findElement(By.xpath("//*[@id=\"d177-email\"]")).sendKeys("pavan@gmail.com");
        // driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input[3]")).sendKeys("1221-12-12");
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));




    }
}   
