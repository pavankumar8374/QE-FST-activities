package com.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables/");
        driver.getTitle();
        List<WebElement> rows =driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> columns=driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        // List<WebElement> s_row=driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));
        //  String cellValue =
        //         driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"))
        //               .getText();

        // System.out.println("Cell value (2,2): " + cellValue);

        System.out.println("Number of rows: " + rows.size());
        System.out.println("Number of column: " + columns.size());
        System.out.println("Cell value (2,2):" + driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText());
        driver.quit();

    }
}
