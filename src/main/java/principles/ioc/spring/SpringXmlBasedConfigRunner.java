package principles.ioc.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlBasedConfigRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("principles/ioc/spring/context.xml");
        MessageNotification messageNotification = classPathXmlApplicationContext.getBean(MessageNotification.class);
        messageNotification.notifyUser();
    }
}
