package com.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-content/");
        driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"genButton\"]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated((By.xpath("//*[@id=\"word\"]")),"release"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"word\"]")).getText());
        driver.quit();

       
    }
    
}
