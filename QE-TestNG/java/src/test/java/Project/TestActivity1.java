package Project;

import java.time.Duration;
// import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity1 {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver=new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/orangehrm/");
        
    }

    @Test
    public void Act1(){
        System.out.println(driver.getTitle());
        String title=driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM");
    }

    @Test
    public void Act2(){
        // driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"))
        WebElement image = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        String imageUrl = image.getAttribute("src");

        System.out.println("Image URL: " + imageUrl);

    }

    


    @Test
    public void Act3(){
        WebElement usrname=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
        WebElement password=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
        usrname.sendKeys("orange");
        password.sendKeys("orangepassword123");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        // System.out.println(driver.getTitle(""));
        wait.until(ExpectedConditions.titleIs("OrangeHRM"));
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");

    }

    @Test
    public void Act4(){
        
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
        // driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("afe");
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("kdsda");
        String id1=driver.findElement(By.xpath("//*[@id=\"employeeId\"]")).getText();
        
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"empsearch_id\"]")).sendKeys(id1);
        driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
        String id2=driver.findElement((By.linkText(id1))).getText();
        Assert.assertEquals(id1, id2);
        

    }
    @Test
    public void Act5(){
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpFirstName\"]")).sendKeys("lo");
        driver.findElement(By.xpath("//*[@id=\"personal_txtEmpLastName\"]")).sendKeys("w]orld");
        WebElement s=driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[1]/ul/li[1]/label"));
        s.click();
        WebElement s1=driver.findElement(By.xpath("//*[@id=\"personal_cmbNation\"]"));
        Select select = new Select(s1);
        select.selectByVisibleText("Greek");
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();


    }
    @Test
    public void Act6(){
        WebElement dir=driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]/b"));
        dir.click();
        String x=driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[1]/h1")).getText();
        Assert.assertEquals(x, "Search Directory");
    }
    @Test
    public void Act7(){
        driver.findElement(By.xpath("//*[@id=\"menu_pim_viewMyDetails\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[9]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"addWorkExperience\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"experience_employer\"]")).sendKeys("kx");
        driver.findElement(By.xpath("//*[@id=\"experience_jobtitle\"]")).sendKeys("xz");
        driver.findElement(By.xpath("//*[@id=\"btnWorkExpSave\"]")).click();

    }
    @Test
    public void Act8(){
        driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).click();
        driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[4]/div/a/img")).click();
        WebElement s1=driver.findElement(By.xpath("//*[@id=\"applyleave_txtLeaveType\"]"));  
        Select select = new Select(s1);
        select.selectByVisibleText("DayOff");
    }    

    @Test
    public void Act81(){
        
        WebElement d1=driver.findElement(By.xpath("//*[@id=\"applyleave_txtFromDate\"]"));
        
        d1.clear();
        d1.sendKeys("2020-02-12",Keys.ENTER);
        WebElement d2=driver.findElement(By.xpath("//*[@id=\"applyleave_txtToDate\"]"));
        
        d2.clear();
        d2.sendKeys("2020-02-19",Keys.ENTER);
        
}
    @AfterClass
    public void tearDown(){
        // driver.quit();
    }
}
