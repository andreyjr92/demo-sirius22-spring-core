package principles.di.v2;

import principles.di.v2.messager.TelegramMessenger;

public class RunnerV2 {
    public static void main(String[] args) {
        MessageNotification messageNotification = new MessageNotification(
                new TelegramMessenger(
                        new TinkoffMobileProvider()
                )
        );
        messageNotification.notifyUser("Everything is under my control");
    }
}
