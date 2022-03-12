
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static base.BaseUIHelper.getDriver;
import static org.testng.Assert.*;

public class ProductPage extends BasePage {
    @FindBy(css = "[class='title']")
    private WebElement titleElement;

    @FindBy(css = "[data-test='product_sort_container']")
    private WebElement sortingElement;

    @FindBy(css = "[class='inventory_item_price']")
    private List<WebElement> itemsPricesElements;

    @FindBy(css = "[data-test='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement fleeceJacketAddToCardElement;

    @FindBy(css = "[id='shopping_cart_container']")
    private WebElement cartElement;


    private String url = "https://www.saucedemo.com/inventory.html";

    public ProductPage() {
        assertEquals(getDriver().getCurrentUrl(), url, "On wrong page");
    }

    public void checkPriceLowToHighFiltering() {
        Select sorting = new Select(sortingElement);
        sortingElement.click();
        sorting.selectByValue("lohi");
        checkItemPriceAscending(itemsPricesElements);
    }

    public void checkIsOnProductPage() {
        assertEquals(titleElement.getText(), "PRODUCTS", "On wrong page");
    }

    private void checkItemPriceAscending(List<WebElement> pricesElements) {
        List<Double> prices = new ArrayList<>();
        for (WebElement priceElement : pricesElements) {
            prices.add(Double.parseDouble(priceElement.getText().substring(1)));
        }
        List<Double> expectedPricesSorted = new ArrayList<>(prices);
        Collections.sort(expectedPricesSorted);

        assertEquals(prices, expectedPricesSorted, "Sorting isn't correct");
    }


    public void addToCart() {
        scrollIntoView(fleeceJacketAddToCardElement);
        fleeceJacketAddToCardElement.click();
    }

    public void goToCart() {
        scrollIntoView(cartElement);
        cartElement.click();
    }
}