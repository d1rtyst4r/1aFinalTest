package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Card{
    private String productName = "detailed-cart-item__name-link";
    private String productPrice = "detailed-cart-item__price";
    private String goToLoginButton = "[data-disable-with=\"Turpināt\"]";
    private String subminButton = "div > [data-disable-with=\"Turpināt\"]";
    private String emailInput = "input.users-session-form__input.users-session-form__input--text.users-session-form__input--error";

    public String getProductPrice(){
        String price = $(By.className(productPrice)).getText();

        return price;
    }

    public String getProductName(){
        String name = $(By.className(productName)).getText();
        return name;
    }

    public void confirmOrder(){
        $(goToLoginButton).click();
    }

    public void login(String email) {
        $(subminButton).submit();
        $(emailInput).setValue(email);
        $(subminButton).submit();
    }
}
