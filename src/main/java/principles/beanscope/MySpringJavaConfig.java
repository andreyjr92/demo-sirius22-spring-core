package principles.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import principles.beanscope.interfaces.TelecomProvider;

@Configuration
@ComponentScan(basePackages = "principles.beanscope")
public class MySpringJavaConfig {

    @Bean
    public TelecomProvider telecomProvider() {
        return new TinkoffMobileProvider();
    }
}