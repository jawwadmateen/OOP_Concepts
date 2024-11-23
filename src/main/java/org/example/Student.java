package org.example;

public class Student
{
    String name;
    static int init_Static_Body;
    float marks;
    int rollno;//gg
    final int CAMPUS_CODE=001;
    static int no_Of_Students;
    //Static variable,function,class everything is resolved at compile time 
    static
    {
        init_Static_Body=100; //initialized when class loads for first time (for static members)
    }
    Student() //default constructor
    {
        System.out.println("hello");
        Student.no_Of_Students+=1;
    }
    Student(String name,float marks,int rollno) //parametrized constructor
    {
        this();
        this.name=name;
        this.marks=marks;
        this.rollno=rollno;
        //Student.no_Of_Students+=1;
    }
     void study()
    {
        System.out.println(this.name+" is studying");
    }
    static void fun()
    {
        System.out.println("Static method called");
        //study(); // will invoke an error as non static method called without obj inside static meethod
    }
    void fun2()
    {
        study(); //will not invoke an error as study2() will use fun2()'s instance variable (object)
        // you can call non static method inside non static method without object and dot operator
    }
//for calling finalize when garbage collection works
    //@Override
//    protected void finalize() throws Throwable {
//        System.out.println("finalize called");
//    }
}
