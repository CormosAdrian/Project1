package com.Adrian.Tests;

import com.Adrian.Pages.BricoPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.Adrian.Pages.BasePage.ADRESA_URL;

public class BricoTest extends BaseTest{
    @Test()
    public static void blabla() {
        driver=new ChromeDriver();
        driver.get(ADRESA_URL);
        waitFor(4000);
        BricoPage bricoPage=new BricoPage(driver);
        bricoPage.cookieButton();
        waitFor(2000);
        bricoPage.ideaButton();
        waitFor(2000);
        bricoPage.gardenButton();
        bricoPage.swingConstruction();
        waitFor(1000);
        bricoPage.CheckImage();
        waitFor(1000);
        Assert.assertTrue(bricoPage.CheckTitle());

    }
}
