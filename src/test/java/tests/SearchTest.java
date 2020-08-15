package tests;


import com.codeborne.selenide.Configuration;
import models.Product;
import models.User;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.Card;
import pageObjects.HomePage;
import pageObjects.Order;

import static com.codeborne.selenide.Selenide.*;


public class SearchTest {
    HomePage homePage = new HomePage();
    Card card = new Card();
    Order order = new Order();
    Product product = new Product();
    User user = new User();

    @Test
    public void OrderTest() throws InterruptedException {
        Configuration.startMaximized = true;
        open("https://1a.lv");
        homePage.logoIsVisible();
        homePage.acceptCookies();
        homePage.searchProduct(product.getProductNameForSearch());
        String productName = card.getProductName();
        product.setProductName(productName);
        String productPrice = card.getProductPrice();
        product.setProductPrice(productPrice);
        card.confirmOrder();
        card.login(user.getEmail());
        order.fillOrderForm(user.getName(), user.getLastmane(), user.getPhoneNumber());
        order.checkOrderDetails(user.getName(), user.getLastmane(),product.getProductPrice());

    }

}
