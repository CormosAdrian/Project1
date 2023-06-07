package com.Adrian.Tests;

import com.Adrian.Pages.ShopPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopTest extends BaseTest {
    @Test
    public static void ShopTest() {

        NavigateToSearch();
        ShopPage shopPage=new ShopPage(driver);
        shopPage.selectProduct();
        shopPage.setQuantity();
        shopPage.addToCart();
        waitFor(5000);
        Assert.assertTrue(shopPage.countNumber());
    }
}