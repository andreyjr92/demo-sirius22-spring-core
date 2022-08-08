package principles.ioc.spring.messengers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import principles.ioc.spring.interfaces.Messenger;
import principles.ioc.spring.interfaces.TelecomProvider;

public class ICQMessenger implements Messenger {

    private TelecomProvider telecomProvider;

    public ICQMessenger(TelecomProvider telecomProvider) {
        this.telecomProvider = telecomProvider;
    }

    @Override
    public void sendMessage(String message) {
        try {
            telecomProvider.connect();
            System.out.println(message);
        } catch (InterruptedException e) {
            //any exception handler
            e.printStackTrace();
        }

    }
}
