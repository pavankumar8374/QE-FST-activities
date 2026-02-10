package com.demos;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/drag-drop/");
        driver.getTitle();
        
        driver.quit();
        
    }
}
