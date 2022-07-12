package principles.di.v1;

import java.util.concurrent.TimeUnit;

public class TelegramMessenger {

    private void callMeBackDurov() {
        System.out.println("Pavel, what's happened with VK?");
    }

    public void sendMessage(String message) {
        callMeBackDurov();
        // sends message to telegram account
        try {
            System.out.println("Connecting to provider, please wait....");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(message + ". Message successfully sent");
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to send notification via telegram messenger");
        }
    }
}
