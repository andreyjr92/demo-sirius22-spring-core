package principles.di.v2;

import principles.di.v2.interfaces.TelecomProvider;

import java.util.concurrent.TimeUnit;

public class TinkoffMobileProvider implements TelecomProvider {

    @Override
    public void connect() throws InterruptedException {
        System.out.println("Connecting to provider, please wait....");
        TimeUnit.SECONDS.sleep(2);
    }
}