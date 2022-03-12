package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.*;

public class CartPage extends BasePage{
    @FindBy(css = "[class='inventory_item_name']")
    private WebElement cartItem;

    @FindBy(css = "[data-test='checkout']")
    private WebElement checkOutButton;



    public void isFleeceJacketInTheCart(){
        String expectedText = "Sauce Labs Fleece Jacket";
        assertEquals(cartItem.getText(),expectedText);
    }
    public void checkOut(){
        checkOutButton.click();
    }
}