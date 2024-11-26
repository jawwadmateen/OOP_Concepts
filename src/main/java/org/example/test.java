package org.example;

public class test {

    int num1,num2;

    public test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static void main(String[] args) {
        test t1=new test(1,2);
        test t2=new test(1,2);
        if(t1 instanceof test)
        {
            System.out.println("hello inside instanceof check\n");
            System.out.println(t1.getClass().getName());
        }

    }
}
