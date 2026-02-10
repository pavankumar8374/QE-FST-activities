package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class=\"svelte-1pdjkmx\"]")).click();
        driver.close();

    }
}
