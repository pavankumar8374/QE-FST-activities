package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls/");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).isSelected());
        driver.quit();

    }
}
