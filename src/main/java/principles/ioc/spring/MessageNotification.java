package principles.ioc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import principles.ioc.spring.interfaces.Messenger;

@Component
public class MessageNotification {

    private final Messenger firstMessenger;
    private Messenger secondMessenger;

    //field-based dependency injection
    @Autowired
    private Messenger thirdMessenger;

    // Dependency goes from the outside, IoC
    // Constructor-based dependency injection
    @Autowired
    public MessageNotification (@Qualifier("telegram") Messenger firstMessenger) {
        this.firstMessenger = firstMessenger;
    }

    public void notifyUser() {
        firstMessenger.sendMessage("Message to your friend");
        secondMessenger.sendMessage("Message to your dad");
        thirdMessenger.sendMessage("Message to your grandma");
        // any code to send message
    }

    // Setter-based injection
    @Autowired
    @Qualifier("whatsup")
    public void setSecondMessenger(Messenger secondMessenger) {
        this.secondMessenger = secondMessenger;
    }
}