package com.Adrian.Tests;

import com.Adrian.Pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Test()
    public static void SearchBarTest (){
        waitFor(3000);
        NavigateToFirstPage();
        SearchPage searchPage= new SearchPage(driver);
        waitFor(3000);
        searchPage.searchBar();
        searchPage.selectProduct();
        searchPage.stockButton();
        waitFor(3000);
        Assert.assertTrue(searchPage.verifyStock("0 buc."),"Exista produse in stock");

    }
}
