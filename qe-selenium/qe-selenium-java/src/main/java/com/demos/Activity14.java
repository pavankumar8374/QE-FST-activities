package com.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables/");
        driver.getTitle();
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> columns = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
     
        for (int i=1;i<rows.size();i++){
            for (int j=1;j<columns.size();j++){
                System.out.println(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText());
            }
            
        }
        driver.quit();
    }
}
