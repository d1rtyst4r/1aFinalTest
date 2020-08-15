package pageObjects;

import common.Common;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends Common {

    private String logo = "a.main-logo.main-logo--checkout";
    private String searchBox = "q";
    private String searchButton = "main-search-submit";
    private String acceptCookiesButton = "#CybotCookiebotDialogBodyButtonAccept.c-button";
    private String laptopsButton = "//span[text()='Portatīvie datori ']";
    private String productMac = "a.new-product-name[data-gtm-link='258041']";
    private String addToCardButton = "add_to_cart_btn";
    private String goToCard = ".//a[text()=\"Pārlūkot pirkumu grozu\"]";

    public void logoIsVisible(){
        $(logo).isDisplayed();
    }

    public void searchProduct(String product){
        $(By.id(searchBox)).setValue(product);
        $(By.className(searchButton)).pressEnter();
        $(By.xpath(laptopsButton)).click();
        $(productMac).click();
        $(By.id(addToCardButton)).click();
        $(By.xpath(goToCard)).click();

    }
    public void acceptCookies(){
        $(acceptCookiesButton).click();
    }



}
