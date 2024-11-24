package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student("John",55.5f,11);
        //s2.CAMPUS_CODE=33;  Assigning value to final keyword variable
        Student s3;
        Student s4=new Student();
        s3=s2;
        s3.study();
        s3.rollno=12;
        System.out.println("s3 roll number is "+s3.rollno);
        System.out.println("s4 data: "+s4.rollno+" "+s4.name+" "+s4.marks);
        Student s5;
//        for (int i=0;i<10000000;i++)  Loop for calling finalize function when garbage collection works
//        {
//            s5=new Student();
//        }

        final Student wrapperCheck=new Student("John",62.55f,12);
//        wrapperCheck=s4;  demonstrating error when final keyword is used and you are reassigning values
        wrapperCheck.marks=35;
        System.out.println("You can Assign values to primitive datatypes "+wrapperCheck.marks);
        System.out.println("Total number of students enrolled are "+Student.no_Of_Students);
        System.out.println("Initialized through static body  "+Student.init_Static_Body);
        Integer w1=12;
        w1=13;
        Singleton Single_Instace=Singleton.getInstance(); //constructor will be called once here
        Singleton Single_Instace1=Singleton.getInstance(); //same instance will be returned
        Singleton Single_Instace2=Singleton.getInstance(); //same instance will be returned
        Singleton Single_Instace3=Singleton.getInstance(); //same instance will be returned


        //Packages are nothing but folder (container) for classes





    }
}
