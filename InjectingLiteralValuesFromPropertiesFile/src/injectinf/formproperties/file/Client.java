package injectinf.formproperties.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/resource/Config.xml");
        System.out.println("Beans loaded");
        Student student = context.getBean("student",Student.class);
       student.display();
    }
}
