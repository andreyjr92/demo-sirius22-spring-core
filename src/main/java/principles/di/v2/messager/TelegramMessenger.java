package principles.di.v2.messager;

import principles.di.v2.interfaces.Messenger;
import principles.di.v2.interfaces.TelecomProvider;

public class TelegramMessenger implements Messenger {

    private TelecomProvider telecomProvider;

    public TelegramMessenger(TelecomProvider telecomProvider) {
        this.telecomProvider = telecomProvider;
    }

    private void callMeBackDurov() {
        System.out.println("Pavel, what's happened with VK?");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackDurov();
        // sends message to telegram account
        try {
            telecomProvider.connect();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to send notification via telegram messenger");
        }
        System.out.println(message + ". Message successfully sent");
    }
}