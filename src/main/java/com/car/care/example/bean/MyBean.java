package com.car.care.example.bean;

public class MyBean {
    public String Message;
    public String Message2;

    public void setMessage(String message) {
        Message = message;
    }

    public void setMessage2(String message2) {
        Message2 = message2;
    }

    public void ShowMessage() {
        System.out.println(Message);
    }
    public void ShowMessage2() {
        System.out.println(Message2);
    }


    @Override
    public String toString() {
        return "MyBean{" +
                "Message=" + (Message != null ? Message : Message2) +
                '}';
    }


}
