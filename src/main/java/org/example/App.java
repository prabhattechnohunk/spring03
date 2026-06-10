package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//this is main class
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
        System.out.println("Changes by Salim");
       Hello.hello("Bijaya" ,101);
       //modification in prabhat-deveop2
        int mul = Hello.multiply(10,20,30);
        System.out.println(mul);
    }
}
