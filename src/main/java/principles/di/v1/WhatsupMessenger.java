package principles.di.v1;

import java.util.concurrent.TimeUnit;

public class WhatsupMessenger {

    private void callMeBackMark() {
        System.out.println("Mark, how are u? Call me back");
    }

    public void sendMessage(String message) {
        callMeBackMark();
        // sends message to whats up account
        try {
            System.out.println("Connecting to provider, please wait....");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(message + ". Message successfully sent");
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to send notification via WhatsUpMessenger");
        }
    }
}