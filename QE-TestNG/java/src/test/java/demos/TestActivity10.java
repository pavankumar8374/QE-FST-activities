package demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.text.SimpleDateFormat;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestActivity10 {
    WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form/");
    }

    @BeforeMethod
    public void loadPage(){
        driver.get("https://training-support.net/webelements/simple-form/");
}

    @DataProvider(name = "excelData")
    public Iterator<Object[]> getExcelData() throws IOException {
        List<Object[]> data = new ArrayList<>();
        String excelPath = "src/test/resources/Book2.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath)) {
            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if(row == null) continue;
                
                String[] rowData = new String[row.getLastCellNum()];
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    rowData[j] = formatter.formatCellValue(row.getCell(j));
                }
                data.add(rowData);
            }
            workbook.close();
        }
        return data.iterator();
    }
    @Test(dataProvider = "excelData")
    public void verifyUserDetails(String username, String email, String date,String details) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement inp=driver.findElement(By.xpath("//*[@id=\"full-name\"]"));
        WebElement emails=driver.findElement(By.xpath("//*[@id=\"email\"]"));
        WebElement dat=driver.findElement(By.xpath("//*[@id=\"signInForm\"]/input[3]"));
        WebElement tarea=driver.findElement(By.xpath("//*[@id=\"additional-details\"]"));
        WebElement button=driver.findElement(By.xpath("//*[@id=\"signInForm\"]/button"));
        
        inp.sendKeys(username);
        emails.sendKeys(email);
        
        dat.sendKeys(date); 

        tarea.sendKeys(details);
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        System.out.println(driver.findElement((By.xpath("//*[@id=\"action-confirmation\"]"))).getText());

    

        
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
    
}
