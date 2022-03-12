package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
    @FindBy(css = "[data-test='firstName']")
    private WebElement firstNameElement;

    @FindBy(css = "[data-test='lastName']")
    private WebElement lastNameElement;

    @FindBy(css = "[data-test='postalCode']")
    private WebElement postalCodeElement;

    @FindBy(css = "[data-test='continue']")
    private WebElement continueButton;

    public void fillForm() {
        firstNameElement.sendKeys("Jor");
        lastNameElement.sendKeys("Meliksetyan");
        postalCodeElement.sendKeys("0123");

    }

    public void continueCheckout() {
        continueButton.click();
    }
}