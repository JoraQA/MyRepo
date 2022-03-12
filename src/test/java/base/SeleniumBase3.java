package base;

import apitest.Practice3;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SeleniumBase3 {
    public class Test3 extends SeleniumBase3 {
        WebDriver driver;
        Practice3 practice3;

        @Test(priority = 1)
        public void Test34() {
            practice3 = new Practice3(driver);
            practice3.submit();
        }

        @Test(priority = 2)
        public void text(){
            practice3.inputType("France");
        }

        @Test(priority = 3)
        public void dropdown(){
            practice3.dropdownMenu();
            practice3.Option();
            practice3.Checkbox();
        }

        @Test(priority = 4)
        public void window(){
            practice3.OpenWindow();
        }

        @Test(priority = 5)
        public void tab(){
            practice3.OpenTab();
        }

        @Test(priority = 6)
        public void alert(){
            practice3.OpenAlert("Name");
        }

        @Test(priority = 7)
        public void alertButton(){
            practice3.aletb();
        }

        @Test(priority = 8)
        public void name2(){
            practice3.alertconfirmname("Name");
        }
    }
}
