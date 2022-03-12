package pages;

import base.BaseUIHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected Actions actions;
    private final int TIME_OUT = 30;
    private final int SLEEP = 2;

    private WebDriverWait wait;


    public BasePage(String pageURL) {
        driver = BaseUIHelper.getDriver();
        driver.get(pageURL);
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT), Duration.ofSeconds(SLEEP));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
    }

    public BasePage() {
        driver = BaseUIHelper.getDriver();
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIME_OUT), Duration.ofSeconds(SLEEP));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TIME_OUT));
        driver.manage().window().maximize();
    }

    protected void type(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    protected void scrollIntoView(WebElement element, boolean alignToTop) {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(" + alignToTop + ")", element);
    }
    protected void scrollIntoView(WebElement element){
        scrollIntoView(element, true);
    }
}