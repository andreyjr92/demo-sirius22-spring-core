package principles.ioc.spring.messengers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import principles.ioc.spring.interfaces.Messenger;
import principles.ioc.spring.interfaces.TelecomProvider;

@Component("ICQ")
@Primary
public class ICQMessenger implements Messenger {

    private TelecomProvider telecomProvider;

    public ICQMessenger(TelecomProvider telecomProvider) {
        this.telecomProvider = telecomProvider;
    }

    private void brutalMessage() {
        System.out.println("ICQ still alive!");
    }

    @Override
    public void sendMessage(String message) {
        brutalMessage();
        try {
            telecomProvider.connect();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to send notification via ICQ messenger");
        }
        System.out.println(message + ". Message successfully sent");
    }
}