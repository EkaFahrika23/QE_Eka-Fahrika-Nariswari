package starter.fitures;

import net.thucydides.core.annotations.Step;

public class Notification {

    @Step("user login to linkedIn account")
    public void loginToAccount(){
        System.out.println("user login to linkedIn account");
    }
    @Step("another user interacts with their profile, such as liking or commenting on a post, sending a connection request or endorsing a skill")
    public void anotherUserInteracts(){
        System.out.println("another user interacts with their profile, such as liking or commenting on a post, sending a connection request or endorsing a skill");
    }
    @Step("user will receive a notification about the interaction")
    public void receiveNotification(){
        System.out.println("user will receive a notification about the interaction");
    }
    @Step("user can be viewed by clicking on the notification icon on the top right corner of the screen")
    public void viewedNotification(){
        System.out.println("user can be viewed by clicking on the notification icon on the top right corner of the screen");
    }
}
