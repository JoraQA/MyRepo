package pages;
import static org.testng.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutComplete extends BasePage{
    @FindBy(css = "[class ='complete-header' ]")
    private WebElement checkOutMessage;

    public void checkCheckOutMessage(){
        String expectedMessage = "THANK YOU FOR YOUR ORDER";
        assertEquals(checkOutMessage.getText(),expectedMessage);
    }
}