package principles.di.v2;

import principles.di.v2.interfaces.Messenger;

public class MessageNotification {

    private Messenger messenger;

    public MessageNotification(Messenger messenger) {
        this.messenger = messenger;
    }

    public void notifyUser(String message) {
        messenger.sendMessage(message);
        // any code to send message
    }
}
