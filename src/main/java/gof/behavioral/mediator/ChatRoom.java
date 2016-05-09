package gof.behavioral.mediator;

/**
 * Created by rtsy on 21.03.2016.
 */
import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " -=" + user.getName() + "=- says : " + message);
    }
}