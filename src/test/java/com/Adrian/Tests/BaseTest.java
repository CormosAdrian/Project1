package com.Adrian.Tests;

import com.Adrian.Pages.BricoPage;
import com.Adrian.Pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.Adrian.Pages.BasePage.ADRESA_URL;

public class BaseTest {

    protected static WebDriver driver;

    public static void waitFor(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeMethod
    protected void setUp(){

        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
       System.setProperty("webdriver.http.factory", "jdk-http-client");


    }
    public static void NavigateToFirstPage() {
        driver=new ChromeDriver();
        driver.get(ADRESA_URL);
        BricoPage webBricoPage= new BricoPage(driver);
        webBricoPage.cookieButton();
    }
    public static void NavigateToSearch() {
        NavigateToFirstPage();
        SearchPage webSearchPage=new SearchPage(driver);
        waitFor(3000);
        webSearchPage.searchBar();

    }




    @AfterMethod
    protected void tearDown(){
        driver.manage().deleteAllCookies();
        //driver.close();
    }
}
