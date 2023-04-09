package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Connection {

    @Step("user on the connection page")
    public void onTheConnectionPage(){
        System.out.println("user on the connection page");
    }
    @Step("user searches for a specific person or views a suggested connection and decides to connect with them")
    public void searchPerson(){
        System.out.println("user searches for a specific person or views a suggested connection and decides to connect with them");
    }
    @Step("user can click on the \"Connect\" button and send a personalized connection request to the selected person")
    public void clickConnect(){
        System.out.println("user can click on the \"Connect\" button and send a personalized connection request to the selected person");
    }
    @Step("user has one or more pending connection requests")
    public void hasPendingConnection(){
        System.out.println("user has one or more pending connection requests");
    }
    @Step("user clicks on the \"My Network\" icon on the top right corner of the screen and selects \"Pending Invitations\"")
    public void clickMyNetwork(){
        System.out.println("user clicks on the \"My Network\" icon on the top right corner of the screen and selects \"Pending Invitations\"");
    }
    @Step("user can view their pending connection requests and click on the \"Accept\" button")
    public void AcceptButton(){
        System.out.println("user can view their pending connection requests and click on the \"Accept\" button");
    }
    @Step("user has pending connection requests")
    public void hasConnectionRequest(){
        System.out.println("user has pending connection requests");
    }
    @Step("user clicks on the \"My Network\" icon and selects \"Pending Invitations\"")
    public void PendingInvitations(){
        System.out.println("user clicks on the \"My Network\" icon and selects \"Pending Invitations\"");
    }
    @Step("user can view their pending connection requests and click on the \"Ignore\" button")
    public void clickIgnoreButton(){
        System.out.println("user can view their pending connection requests and click on the \"Ignore\" button");
    }
}
