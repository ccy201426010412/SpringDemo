package example.service;

import example.dao.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("file:D:\\IDEA_WorkSpace\\SpringDemo\\src\\main\\resources\\Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
