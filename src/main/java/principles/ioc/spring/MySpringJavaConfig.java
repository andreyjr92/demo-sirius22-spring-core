package principles.ioc.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import principles.ioc.spring.interfaces.Messenger;
import principles.ioc.spring.interfaces.TelecomProvider;
import principles.ioc.spring.messengers.TelegramMessenger;

@Configuration
@ComponentScan(basePackages = "principles.ioc")
public class MySpringJavaConfig {

    @Bean
    public TelecomProvider telecomProvider() {
        return new TinkoffMobileProvider();
    }

    @Bean
    @Qualifier("Telegram")
    public Messenger telegramMessenger() {
        return new TelegramMessenger(telecomProvider());
    }
}