package principles.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import principles.beanscope.interfaces.Messenger;
import principles.beanscope.messengers.TelegramMessenger;
import principles.beanscope.messengers.WhatsUpMessenger;

public class SpringAnnotationBasedConfigRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringJavaConfig.class);

        TelegramMessenger telegram1 = (TelegramMessenger) context.getBean("telegram");
        TelegramMessenger telegram2 = (TelegramMessenger) context.getBean("telegram");
        System.out.println(telegram1==telegram2);
        System.out.println(telegram1);
        System.out.println(telegram2);
        telegram1.setID(123);
        telegram2.setID(321);
        System.out.println(telegram2.getID());

        Messenger whatsUpMessenger1 = context.getBean(WhatsUpMessenger.class);
        Messenger whatsUpMessenger2 = context.getBean(WhatsUpMessenger.class);
        System.out.println(whatsUpMessenger1==whatsUpMessenger2);
        System.out.println(whatsUpMessenger1);
        System.out.println(whatsUpMessenger2);
    }
}