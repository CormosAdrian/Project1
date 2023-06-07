package com.Adrian.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BricoPage extends BasePage{
    @FindBy(xpath = "//*[@id=\"html-body\"]/aside/div/div/div/button[1]")
    WebElement cookie;
    @FindBy(css = "#html-body > div.page-wrapper > div.top-menu > div > div > ul > li:nth-child(6) > a")
    WebElement idea;
    @FindBy(css = "#maincontent > div.columns > div.sidebar.sidebar-main > div.desktop-block.amblog-element-block > div > div > ul > li.amblog-category.amblog-category-7 > a")
    WebElement garden;
    @FindBy(css = "#maincontent > div.columns > div.column.main > ul > li:nth-child(2) > div.amblog-content > h2 > a")
    WebElement swing;
    @FindBy(className = "amblog-image")
    WebElement img;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[1]/h1")
    WebElement title;



    public BricoPage(WebDriver driver) {
        super(driver);
    }

    public void cookieButton (){
        cookie.click();
    }
    public void ideaButton (){
        idea.click();
    }
    public void gardenButton (){
        garden.click();
    }
    public void swingConstruction (){
        swing.click();
    }
    public boolean CheckImage (){
        return img.isDisplayed();
    }
    public boolean CheckTitle (){
        return title.getText().contains("Cum construiești un leagăn de grădină:");

    }

    }



