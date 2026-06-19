package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanUser.xml");
        UserManager userManagerwithDB = (UserManager) context.getBean("UserDB");
        UserManager userManagerwithNDB = (UserManager) context.getBean("UserManagerwithNDB");
        UserManager userManagerwithWS = (UserManager) context.getBean("UserManagerwithWS");

        System.out.println(userManagerwithNDB.getUserDetails());
        System.out.println(userManagerwithWS.getUserDetails());
        System.out.println(userManagerwithDB.getUserDetails());


        /*

        webserviceprovider webserviceprovider = new webserviceprovider();
        UserManager userdata1 = new UserManager(webserviceprovider);
        System.out.println(userdata1.getUserDetails());

        NewDatabse newDatabse = new NewDatabse();
        UserManager newdata = new UserManager(newDatabse);
        System.out.println(newdata.getUserDetails();

         */
    }
}
