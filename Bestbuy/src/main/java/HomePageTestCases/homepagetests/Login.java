package HomePageTestCases.homepagetests;

import base.CommonAPI;
import org.testng.annotations.Test;

public class Login extends CommonAPI {


    public void login(){
        sleepFor(3);
        clickOnElementByXpath("//button[@class='close']");
        sleepFor(2);
        clickOnElementByXpath("//span[@class='flyBtn']");
        clickOnElementByXpath("//button[@class='lam-signIn__button btn btn-secondary']");
        typeOnElementByXpath("//input[@id='fld-e']","foysol99@yahoo.com");
        typeOnElementByXpath("//input[@id='fld-p1']","123456");
        clickOnElementByXpath("//button[@type='submit']");

    }
}
