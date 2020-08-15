package stepsDefenitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Product;
import models.User;
import pageObjects.Card;
import pageObjects.HomePage;
import pageObjects.Order;

import static com.codeborne.selenide.Selenide.open;

public class OrdgerSteps {
    HomePage homePage = new HomePage();
    Card card = new Card();
    Order order = new Order();
    Product product = new Product();
    User user = new User();

    @Given("^I open web (.*)$")
    public void isOpenOneALV(String url) {
        Configuration.startMaximized = true;
        open(url);
    }
    @Given("1a logo is visible")
        public void oneAlogoIsVible(){
            homePage.logoIsVisible();
        }
        @When("I accept cookies")
                public void accepCookies(){
            homePage.acceptCookies();

        }
        @When("I search macbook")
                public void searchProduct(){
            homePage.searchProduct(product.getProductNameForSearch());
        }
        @When("I save product name and price")
                public void saveProductDetails(){
            String productName = card.getProductName();
            product.setProductName(productName);
            String productPrice = card.getProductPrice();
            product.setProductPrice(productPrice);
        }
        @When("I confirm my Order")
                public void confirmMyOrder(){
            card.confirmOrder();
        }
        @When("I logIn as guest")
                public void loginAsGuest(){
            card.login(user.getEmail());
        }
        @When("I fill form")
                public void iFillForm() throws InterruptedException {
            order.fillOrderForm(user.getName(),user.getLastmane(),user.getPhoneNumber());
        }
        @Then("I check name and price")
                public void checkDetails(){
            order.checkOrderDetails(user.getName(),user.getLastmane(),product.getProductPrice());
        }

}