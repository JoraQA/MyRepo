package seleniumTests;


import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.Autoam;

    public class Autotest extends SeleniumBase {

        Autoam autoam;

        @Test(priority = 1)
        public void checktesla() {
            autoam = new Autoam(driver);
            autoam.inputsearchbox("Auto.am");
            autoam.webclick();
            autoam.dismiss();
            autoam.klini();
            autoam.klini2("Tesla");
            autoam.modeltesla();
            autoam.ymodel("Model Y");
            autoam.popoq();
            autoam.sendyear("2018");
            autoam.priceclik();
            autoam.senprice("67000");
            autoam.pricebox();
            autoam.dolarprice("67000");
            autoam.maxsazerclick();
            autoam.searchclick();
            autoam.eee();
            autoam.ooo();
        }
    }

