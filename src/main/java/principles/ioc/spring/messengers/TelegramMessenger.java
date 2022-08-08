package principles.ioc.spring.messengers;

import principles.ioc.spring.TinkoffMobileProvider;
import principles.ioc.spring.interfaces.Messenger;
import principles.ioc.spring.interfaces.TelecomProvider;

public class TelegramMessenger implements Messenger {

    private TelecomProvider telecomProvider;

    public TelegramMessenger(TelecomProvider telecomProvider) {
        this.telecomProvider = telecomProvider;
    }

    public TelegramMessenger(TinkoffMobileProvider tinkoffMobileProvider) {
        this.telecomProvider = telecomProvider;
    }

    private void callMeBackDurov() {
        System.out.println("Pavel, what's happened with VK? Call me back!");
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