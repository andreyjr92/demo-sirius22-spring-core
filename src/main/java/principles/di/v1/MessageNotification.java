package principles.di.v1;

public class MessageNotification {

    private TelegramMessenger telegramMessenger;

    public void notifyUser(String message) {
        telegramMessenger = new TelegramMessenger();
        telegramMessenger.sendMessage(message);
        // any code to send message
    }
}
