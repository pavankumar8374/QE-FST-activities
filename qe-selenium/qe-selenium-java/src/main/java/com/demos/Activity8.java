package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        Actions actions = new Actions(driver);
        
        driver.get("https://training-support.net/webelements/mouse-events/");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[1]/div")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
        
        // System.out.println(driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[2]/div")).getText());
        driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[2]/div")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"result\"]")).getText());
        driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[3]/div")).click();
        
        actions.contextClick(driver.findElement(By.xpath("//*[@id=\"stage\"]/div[1]/div[4]/div"))).perform();


    }
    
}
