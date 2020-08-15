package pageObjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Order {
    private String selectGetOrderInShop = "[value=\"2\"]";
    private String nameInputID = "address_first_name";
    private String lastnameInputID = "address_last_name";
    private String phoneNumberID = "address_phone_number";
    private String continueButton = "button.main-button.upcase.fr.small-radius.button-min-width";
    private String selectPickUpPlace = "[name=\"pickup_point_id\"]";
    private String buyerFullName = "div.name";
    private String orderFinalPrice = "div.price.fr";

    public void fillOrderForm(String userName, String userLastName, String userPhoneNumber) throws InterruptedException {
        $(selectGetOrderInShop).click();
        Thread.sleep(2000);
        $(By.id(nameInputID)).setValue(userName);
        $(By.id(lastnameInputID)).setValue(userLastName);
        $(By.id(phoneNumberID)).setValue(userPhoneNumber);
        $(continueButton).click();
        $(selectPickUpPlace).click();
        $(continueButton).click();

    }

    public void checkOrderDetails(String userName, String userLastName, String productPrice){
        $(buyerFullName).equals(userName + " " + userLastName);
        $(orderFinalPrice).equals(productPrice);

    }
}
