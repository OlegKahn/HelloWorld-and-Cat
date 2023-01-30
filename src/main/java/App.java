import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean =
                (Cat) applicationContext.getBean("catB");
        Cat catBeanTwo =
                (Cat) applicationContext.getBean("catB");

        System.out.println("Is HelloWords equal? " + (bean == beanTwo));
        System.out.println("Is Cats equal? " + (catBean == catBeanTwo));
    }
}