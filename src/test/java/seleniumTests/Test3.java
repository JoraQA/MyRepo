package seleniumTests;

import apitest.Practice3;
import base.SeleniumBase3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Test3 extends SeleniumBase3 {
    WebDriver driver;
        Practice3 practice3;
                @Test(priority = 1)
                public void Test3() {
                    practice3 = new Practice3(driver);
                    practice3.submit();
                }

                @Test(priority = 2)
                public void text(){
                    practice3.inputType("France");
                }

                @Test(priority = 3)
                public void dropdown(){
                    practice3.dropdownMenu();
                    practice3.Option();
                    practice3.Checkbox();
                }

                @Test(priority = 4)
                public void tab(){
                    practice3.OpenTab();
                }

                @Test(priority = 5)
                public void alert(){
                    practice3.OpenAlert("Name");
                }

                public void alertButton(){
                    practice3.aletb();
                }


                public void name2(){
                    practice3.alertconfirmname("Name");
                }

    private String baseUrl = "https://rahulshettyacademy.com/AutomationPractice/";
    private TimeUnit thread;


    @BeforeClass
    public void setUp() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();



        options.setAcceptInsecureCerts(true);
        options.getLogLevel();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {

    }
}
