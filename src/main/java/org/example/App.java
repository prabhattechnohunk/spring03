package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Laptop laptop = (Laptop) context.getBean("laptop");
        System.out.println(laptop);
        Charger charger = (Charger) context.getBean("charger");
        System.out.println(charger);
        Socket socket = (Socket) context.getBean("prabhatSocket");
        System.out.println(socket);
//this is comment by prabhat

    }
}
