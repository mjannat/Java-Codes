package com.selenium.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/file/xml/config.xml");
        Human human = context.getBean("human",Human.class);
        human.startPumping();
    }
}
