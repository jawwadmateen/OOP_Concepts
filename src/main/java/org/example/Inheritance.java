package org.example;

public class Inheritance
{
    int param1;
    int param2;
    Inheritance(int param1,int param2)
    {
        this.param1=param1;
        this.param2=param2;
    }
    Inheritance(Inheritance h1)
    {
        this.param1=h1.param1;
        this.param2=h1.param2;
    }

    public static void main(String[] args) {
        childClass w1=new childClass(1,2,3);
        Inheritance w2=new childClass(w1);
    }
}
