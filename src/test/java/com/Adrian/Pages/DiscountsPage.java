package com.Adrian.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountsPage extends BasePage{
   // @FindBy(xpath = "//*[@id=\"html-body\"]/div[3]/div[2]/div/div/ul/li[2]/a")
   @FindBy(css = "#html-body > div.page-wrapper > div.top-menu > div > div > ul > li:nth-child(2) > a")
    WebElement discount ;
    @FindBy(xpath = "//*[@id=\"product-item-info_63813\"]/div/strong/a")
    WebElement product;
    @FindBy(css = "#maincontent > div.columns > div > div.product-info-main > div.product-info-price > div > span.old-price > span > span > span.percent-discount")
    WebElement percent;

    public DiscountsPage (WebDriver driver) {
        super(driver);
    }

    public void discountList(){
        discount.click();
    }
    public void selectProduct(){
        product.click();
    }
    public boolean percentDiscount(){
        return percent.getText().contains("-10%");
    }
}
