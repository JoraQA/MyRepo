package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;

public class CheckOutOverView extends  BasePage{
    @FindBy(css = "[class='summary_total_label']")
    private WebElement totalPriceElement;

    @FindBy(css = "[data-test='finish']")
    private WebElement finishButton;

    public void checkTotalPrice(){
        String expectedTotalPrice = "$53.99";
        assertTrue(totalPriceElement.getText().contains(expectedTotalPrice));
    }
    public void finishCheckOut(){
        finishButton.click();
    }
}