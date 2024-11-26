package Interfaces;

public class Implement_All_Interfaces implements Interface2
{
    @Override
    public void func2() {
        System.out.println("Inside func2");
    }

    @Override
    public void func1() {
        System.out.println("Inside func1");
    }

    public static void main(String[] args) {
        Implement_All_Interfaces i1=new Implement_All_Interfaces();
        i1.func1();
        i1.func2();
    }
}
