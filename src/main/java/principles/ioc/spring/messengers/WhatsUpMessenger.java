package principles.ioc.spring.messengers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import principles.ioc.spring.interfaces.Messenger;
import principles.ioc.spring.interfaces.TelecomProvider;

@Component
@Qualifier("whatsup")
public class WhatsUpMessenger implements Messenger {

    private TelecomProvider telecomProvider;

    public WhatsUpMessenger(TelecomProvider telecomProvider) {
        this.telecomProvider = telecomProvider;
    }

    private void callMeBackMark() {
        System.out.println("Mark, how are u? Call me back");
    }

    @Override
    public void sendMessage(String message) {
        callMeBackMark();
        // sends message to whats up account
        try {
            telecomProvider.connect();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to send notification via WhatsUpMessenger");
        }
        System.out.println(message + ". Message successfully sent");
    }
}
