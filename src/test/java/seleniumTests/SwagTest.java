package seleniumTests;

import base.BaseUIHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.List;
import java.util.Set;

public class SwagTest{

    @Test(testName = "login and perform actions")
    public void loginAndPerformActions(){
        SwagLabsLoginPage loginPage = new SwagLabsLoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.checkIsOnProductPage();
        productPage.checkPriceLowToHighFiltering();
        productPage.addToCart();
        productPage.goToCart();
        CartPage cartPage = new CartPage();
        cartPage.isFleeceJacketInTheCart();
        cartPage.checkOut();
        CheckOutPage checkOutPage = new CheckOutPage();
        checkOutPage.fillForm();
        checkOutPage.continueCheckout();
        CheckOutOverView checkOutOverView = new CheckOutOverView();
        checkOutOverView.checkTotalPrice();
        checkOutOverView.finishCheckOut();
        CheckOutComplete checkOutComplete = new CheckOutComplete();
        checkOutComplete.checkCheckOutMessage();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        BaseUIHelper.getDriver().quit();
    }
}