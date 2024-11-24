package org.example;

public class Singleton {
    private static Singleton instance; //Private instance created which will be returned each  time
    private Singleton() //constructor made private so that it cannot be called from outside
    {
        System.out.println("Singleton Instance created"); //will be shown once in output because of validating singleton pattern
    }
    public static Singleton getInstance() //method made static and public so that instead of constructor this should be called for object creation
    {
        if(instance==null) //if its first time then instance will be created
        {
            instance=new Singleton(); //calling private constructor here for object creation
        }
        return instance;
    }
}
