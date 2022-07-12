package principles.di.v1;

public class RunnerV1 {
    public static void main(String[] args) {
        MessageNotification messageNotification = new MessageNotification();
        messageNotification.notifyUser("Everything is under my control");
    }
}