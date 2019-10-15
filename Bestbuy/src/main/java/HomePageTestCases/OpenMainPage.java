package HomePageTestCases;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenMainPage extends CommonAPI {
    @Test
    public void homepage() throws InterruptedException {

        driver.findElement(By.xpath("//button[@class='close']")).click();


    }

}
