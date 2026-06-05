package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDatabaseProvide userDatabase = new UserDatabaseProvide();
        UserManager userdata = new UserManager(userDatabase);
        System.out.println(userdata.getUserDetails());

        webserviceprovider webserviceprovider = new webserviceprovider();
        UserManager userdata1 = new UserManager(webserviceprovider);
        System.out.println(userdata1.getUserDetails());

        NewDatabse newDatabse = new NewDatabse();
        UserManager newdata = new UserManager(newDatabse);
        System.out.println(newdata.getUserDetails());
    }
}
