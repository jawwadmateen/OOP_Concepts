package org.example;

public class child extends Parent {
    @Override
    void area()
    {
        System.out.println("Child method called");
    }

    public static void main(String[] args) {
        Parent p1=new child(); //Dynamic method dispatch is a process through which java determines which method to run at runtime
        p1.area();
    }
}
