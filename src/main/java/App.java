import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println("Переменные ссылаются на один и тот же объект? "+(bean==bean2));



        Cat one = (Cat) applicationContext.getBean("cat");
        System.out.println(one.getMessage());
        Cat two = (Cat) applicationContext.getBean("cat");
        System.out.println(two.getMessage());
        System.out.println("Переменные ссылаются на один и тот же объект? "+(one==two));

    }
}