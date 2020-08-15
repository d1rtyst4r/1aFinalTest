package models;

public class Product {
    private String productNameForSearch = "Macbook pro";
    private String productName = "";
    private String productPrice = "";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductNameForSearch() {
        return productNameForSearch;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
