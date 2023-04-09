package Starter.features;

import net.thucydides.core.annotations.Step;

public class Payment {

    @Step("user navigate to detail of payment")
    public void detailOfPayment(){
        System.out.println("user navigate to detail of payment");
    }
    @Step("user choice the method of payment to buy the product")
    public void choiceMethodPayment(){
        System.out.println("user choice the method of payment to buy the product");
    }
    @Step("user click \"Buy Now\" button to finish the transaction")
    public void BuyNow(){
        System.out.println("user click \"Buy Now\" button to finish the transaction");
    }
    @Step("user get a receipt")
    public void getReceipt(){
        System.out.println("user get a receipt");
    }
}
