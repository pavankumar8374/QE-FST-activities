package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        FirefoxDriver driver =new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls/");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).isDisplayed());
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/section[1]/button")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).isDisplayed());
        driver.quit();


    }
}
