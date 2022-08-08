package principles.beanscope.messengers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import principles.beanscope.interfaces.Messenger;
import principles.beanscope.interfaces.TelecomProvider;

@Component("telegram")
public class TelegramMessenger implements Messenger {

    private Integer ID;
    private TelecomProvider telecomProvider;

    public TelegramMessenger(TelecomProvider telecomProvider) {
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

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }
}