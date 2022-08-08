package principles.ioc.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationBasedConfigRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MySpringJavaConfig.class);
        MessageNotification messageNotification = annotationConfigApplicationContext.getBean(MessageNotification.class);
        messageNotification.notifyUser();
    }
}
