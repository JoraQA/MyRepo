package apitest;

import base.SeleniumBase;
import base.SeleniumBase3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PracticePage;

public class Practice3 {

    WebDriver driver;

    @FindBy(css = "#radio-btn-example > fieldset > label:nth-child(3) > input")
    WebElement radiobutton;

    @FindBy(id = "autocomplete")
    WebElement SelectCountries;

    @FindBy(id = "dropdown-class-example")
    WebElement dropdown;

    @FindBy(css ="#dropdown-class-example > option:nth-child(4)")
    WebElement option;

    @FindBy(id ="checkBoxOption3")
    WebElement Check;

    @FindBy(id ="openwindow")
    WebElement Window;

    @FindBy(id ="opentab")
    WebElement Tab;

    @FindBy(id ="name")
    WebElement Alert;

    @FindBy(id ="alertbtn")
    WebElement AlertButton;

    @FindBy(id ="name")
    WebElement EnteryourNameConfirm;


    public Practice3 (WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
    public void submit() {
        radiobutton.click();
    }

    public void inputType(String country){
        SelectCountries.sendKeys(country);
    }

    public void dropdownMenu(){
        dropdown.click();
    }
    public void Option(){
        option.click();
    }

    public void Checkbox(){
        if(!Check.isSelected()) {
            Check.click();
        }
    }

    public void OpenWindow() {
        Window.click();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.close();

        driver.switchTo().window(winHandleBefore);
    }

    public void OpenTab() {
        Tab.click();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public void OpenAlert(String alert){
        Alert.sendKeys(alert);
    }

    public void aletb() {
        AlertButton.click();

        Assert.assertEquals(driver.switchTo().alert().getText(),"Hello Name, share this practice ");
        driver.switchTo().alert().accept();

    }

    public void alertconfirmname(String nameconfirm){
        EnteryourNameConfirm.sendKeys(nameconfirm);
    }
}