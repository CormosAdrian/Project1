package com.Adrian.Tests;

import com.Adrian.Pages.DiscountsPage;
import com.Adrian.Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscountTest extends BaseTest {
    @Test()
    public static void DiscountTest() {
        waitFor(3000);
        NavigateToFirstPage();
        DiscountsPage discountsPage = new DiscountsPage(driver);
        waitFor(2000);
        discountsPage.discountList();
        discountsPage.selectProduct();
        waitFor(1000);
        Assert.assertTrue(discountsPage.percentDiscount());
    }
}