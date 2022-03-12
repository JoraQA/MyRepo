
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabsLoginPage extends BasePage{

    private static final String url = "https://www.saucedemo.com/";
    public SwagLabsLoginPage() {
        super(url);
    }

    @FindBy(css = "[data-test='username']")
    private WebElement userNameElement;

    @FindBy(css = "[data-test='password']")
    private WebElement passwordElement;

    @FindBy(css = "[data-test='login-button']")
    private WebElement loginElement;

    @FindBy(css = "[id='login_credentials']")
    private WebElement credentialUserNamesElement;

    @FindBy(css = "[class='login_password']")
    private WebElement credentialPasswordElement;

    public void login(){
        scrollIntoView(credentialPasswordElement);
        String userName = credentialUserNamesElement.getText().split("\n")[1];
        String password = credentialPasswordElement.getText().split("\n")[1];

        scrollIntoView(userNameElement);

        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        loginElement.click();
    }


}