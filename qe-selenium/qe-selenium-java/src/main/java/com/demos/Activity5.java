package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls/");
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.id("textInput")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"textInputButton\"]")).click();
        System.out.println(driver.findElement(By.id("textInput")).isEnabled());
        driver.quit();

    }
    
}
