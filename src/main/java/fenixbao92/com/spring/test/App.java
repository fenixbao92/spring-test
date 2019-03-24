package fenixbao92.com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        System.out.println("Hello World!");
        final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:SpringBeans.xml");

        final HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();


    }
}
