package com.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
    public static void main(String[] args) {
        FirefoxDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls/");
        driver.getTitle();
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]"));
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")));

        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
        driver.quit();

    }
}
