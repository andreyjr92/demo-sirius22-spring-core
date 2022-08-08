package principles.ioc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import principles.ioc.spring.interfaces.Messenger;

@Component
public class MessageNotification {

    private final Messenger firstMessenger;
    private final Messenger secondMessenger;

    @Autowired
    public MessageNotification (@Qualifier("Telegram") Messenger firstMessenger,
                                Messenger secondMessenger) {
        this.firstMessenger = firstMessenger;
        this.secondMessenger = secondMessenger;
    }

    public void notifyUser() {
        firstMessenger.sendMessage("Message to your friend");
        secondMessenger.sendMessage("Message to your dad");
        // any code to send message
    }
}