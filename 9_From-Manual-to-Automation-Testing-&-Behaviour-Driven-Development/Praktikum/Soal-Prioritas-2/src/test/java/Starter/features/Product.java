package Starter.features;

import net.thucydides.core.annotations.Step;

public class Product {

    @Step("user login to Sepulsa application")
    public void loginSepulsa(){
        System.out.println("user login to Sepulsa application");
    }
    @Step("user navigate to the product page")
    public void onTheProductPage(){
        System.out.println("user navigate to the product page");
    }
    @Step("user choice the one or some product")
    public void choiceTheProduct(){
        System.out.println("user choice the one or some product");
    }
    @Step("user can be transaction to buy the product")
    public void transactionTheProduct(){
        System.out.println("user can be transaction to buy the product");
    }
}
