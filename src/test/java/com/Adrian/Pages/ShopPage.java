package com.Adrian.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v107.css.model.Value;
import org.openqa.selenium.support.FindBy;

public class ShopPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"product-item-info_179496\"]/div/strong/a")
    WebElement selectProd;
    @FindBy(id = "qty")
    WebElement quantity;
    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
    WebElement add;
    @FindBy(xpath = "//*[@id=\"ammenu-header-container\"]/div/div[2]/a/span[2]/span[1]")
    WebElement count;

    public ShopPage (WebDriver driver) {
        super(driver);
    }
    public void selectProduct(){
        selectProd.click();
    }

    public void setQuantity() {
        quantity.clear();
        quantity.sendKeys("5");
        quantity.sendKeys(Keys.ENTER);
    }

    public void addToCart() {
        add.click();
    }
    public boolean countNumber(){
        return count.getText().contains("5");

    }
}
