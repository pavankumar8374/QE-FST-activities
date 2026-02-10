package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects/");
        System.out.println(driver.getTitle());
        WebDriver dropdown=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[1]/select"));
        



    }
    
}
