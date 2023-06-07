package com.Adrian.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    @FindBy(css = "#search")
    WebElement search;
    @FindBy(className = "product-image-photo")
    WebElement select;
    @FindBy(id = ("stock-info-trigger"))
    WebElement stock;
    @FindBy(xpath = "//*[@id=\"stock-info-modal\"]/div/div/ul/li[23]/span/span")
    WebElement verify;


    public SearchPage (WebDriver driver) {
        super(driver);
    }
    public void searchBar () {
        search.sendKeys("Grinda");
        search.sendKeys(Keys.ENTER);
    }

    public void selectProduct (){
        select.click();
    }
    public void stockButton (){
        stock.click();
    }

    public boolean verifyStock (String stockCluj) {
        return verify.getText().contains(stockCluj);
    }

}
