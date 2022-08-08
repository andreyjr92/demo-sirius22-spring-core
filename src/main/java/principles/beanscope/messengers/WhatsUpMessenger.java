package principles.beanscope.messengers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import principles.beanscope.interfaces.Messenger;
import principles.beanscope.interfaces.TelecomProvider;

@Component
@Scope("prototype")
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
