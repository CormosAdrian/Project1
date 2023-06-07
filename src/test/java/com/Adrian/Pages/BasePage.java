package com.Adrian.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public final static String ADRESA_URL = "https://www.bricodepot.ro/";

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}