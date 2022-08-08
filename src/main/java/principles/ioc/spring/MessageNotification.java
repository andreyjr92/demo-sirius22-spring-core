package principles.ioc.spring;

import principles.ioc.spring.interfaces.Messenger;

public class MessageNotification {

    private final Messenger firstMessenger;
    private final Messenger secondMessenger;

    public MessageNotification (Messenger firstMessenger,
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