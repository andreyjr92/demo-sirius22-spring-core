package principles.beanscope;

import principles.beanscope.interfaces.TelecomProvider;

import java.util.concurrent.TimeUnit;

public class TinkoffMobileProvider implements TelecomProvider {

    @Override
    public void connect() throws InterruptedException {
        System.out.println("Connecting to provider, please wait....");
        TimeUnit.SECONDS.sleep(2);
    }
}