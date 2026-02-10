package com.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity4 {
    public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
    driver.get("https://training-support.net/webelements/target-practice/");
    System.out.println(driver.getTitle());
    System.out.println(driver.findElement(By.xpath("//h5[@class=\"text-3xl font-bold text-purple-600\"]")).getText());

    System.out.println(driver.findElement(By.xpath("//h3[@class=\"text-3xl font-bold text-orange-600\"]")).getCssValue("color"));
    System.out.println(driver.findElement(By.cssSelector("button.rounded-xl:nth-child(9)")).getAttribute("class"));
    System.out.println(driver.findElement(By.className("bg-slate-200")).getText());
    driver.quit();
    }
}
