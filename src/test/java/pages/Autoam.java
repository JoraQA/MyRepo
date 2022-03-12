package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

    public class Autoam {
        WebDriver driver;

        @FindBy(name = "q")
        WebElement searchbox;
        @FindBy(css = "#rso > div:nth-child(1) > div > div > div > div > div > div.yuRUbf > a > h3")
        WebElement webopage;
        @FindBy(id = "ppialog-popover-cancel-button")
        WebElement but;
        @FindBy(css = "#home-filters > div:nth-child(1) > label > span > span.selection > span")
        WebElement porc;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement porc2;
        @FindBy(css = " #select2-v-model-container")
        WebElement modclick;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement modelsend;
        @FindBy(css = "#home-filters > div:nth-child(3) > label:nth-child(1) > span > span.selection > span > span.select2-selection__arrow")
        WebElement selectyear;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement yearsend;
        @FindBy(css = "#home-filters > div:nth-child(4) > label:nth-child(1) > span > span.selection > span > span.select2-selection__arrow")
        WebElement selprice;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement pricesend;
        @FindBy(css = "#home-filters > div:nth-child(4) > label:nth-child(2) > span > span.selection > span > span.select2-selection__arrow")
        WebElement finalprice;
        @FindBy(css = "body > span > span > span.select2-search.select2-search--dropdown > input")
        WebElement sendfindalprice;
        @FindBy(css = "#home-filters > div.col.s12.m12.l12.home-filters-switch > div:nth-child(1) > label > span")
        WebElement maxsazertvac;
        @FindBy(id = "search-btn")
        WebElement searchbut;
        @FindBy(css = "#ad-2732552 > div.card-content > a > div > span")
        WebElement esime;
        @FindBy(css = "#ad-2732552 > div.card-action > div > span")
        WebElement ofaman;

        public Autoam(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }

        public void inputsearchbox(String tesla) {
            searchbox.sendKeys(tesla);
            searchbox.submit();
        }

        public void webclick() {
            webopage.click();
        }

        public void dismiss() {
            but.click();
        }

        public void klini() {
            porc.click();

        }

        public void klini2(String box) {
            porc2.sendKeys(box);
            porc2.sendKeys(Keys.ENTER);

        }

        public void modeltesla() {
            modclick.click();
        }

        public void ymodel(String ogl) {
            modelsend.sendKeys(ogl);
            modelsend.sendKeys(Keys.ENTER);
        }

        public void popoq() {
            selectyear.click();
        }

        public void sendyear(String olf) {
            yearsend.sendKeys(olf);
            yearsend.sendKeys(Keys.ENTER);
        }

        public void priceclik() {
            selprice.click();
        }

        public void senprice(String oil) {
            pricesend.sendKeys(oil);
            pricesend.sendKeys(Keys.ENTER);
        }

        public void pricebox() {
            finalprice.click();
        }

        public void dolarprice(String oill) {
            sendfindalprice.sendKeys(oill);
            sendfindalprice.sendKeys(Keys.ENTER);
        }

        public void maxsazerclick() {
            maxsazertvac.click();
        }

        public void searchclick() {
            searchbut.click();
        }

        public void eee() {
            System.out.println(esime.getText());
            Assert.assertEquals(esime.getText(), "2021  Tesla Model Y");


        }

        public void ooo() {
            System.out.println(ofaman.getText());
            Assert.assertEquals(ofaman.getText(), "$ 67 000");
        }
    }
