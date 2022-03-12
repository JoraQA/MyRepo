package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterUser {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append(generateRandomString(19)).append("@gmail.ru");
       System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationexercise.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Signup / Login")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("Jor");
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.cssSelector("div.signup-form > form > input[name=\"email\"]")).click();
        driver.findElement(By.cssSelector("div.signup-form > form > input[name=\"email\"]")).sendKeys(str);
        driver.findElement(By.cssSelector("div.signup-form > form > button.btn.btn-default")).click();
        driver.findElement(By.cssSelector("label.top")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("jora123");
        driver.findElement(By.id("days")).click();
        new Select(driver.findElement(By.id("days"))).selectByVisibleText("16");
        driver.findElement(By.id("months")).click();
        new Select(driver.findElement(By.id("months"))).selectByVisibleText("July");
        driver.findElement(By.id("years")).click();
        new Select(driver.findElement(By.id("years"))).selectByVisibleText("2003");
        driver.findElement(By.cssSelector("div.checkbox > label")).click();
        driver.findElement(By.xpath("//section[@id='form']/div/div/div/div/form/div[7]/label")).click();
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).sendKeys("Jor");
        driver.findElement(By.id("last_name")).click();
        driver.findElement(By.id("last_name")).sendKeys("Meliksetyan");
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("ACA");
        driver.findElement(By.id("address1")).click();
        driver.findElement(By.id("address1")).sendKeys("1212s12");
        driver.findElement(By.id("address2")).click();
        driver.findElement(By.id("address2")).sendKeys("1212s123");
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("state")).sendKeys("wqwq");
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("qwqw");
        driver.findElement(By.id("zipcode")).click();
        driver.findElement(By.id("zipcode")).sendKeys("erer");
        driver.findElement(By.id("mobile_number")).click();
        driver.findElement(By.id("mobile_number")).sendKeys("077777777777777");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.linkText("Delete Account")).click();

    }
    public static String generateRandomString(int strLen) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = strLen;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }
}



