package org.example;

public class childClass extends Inheritance
{
    int param3;
    childClass(int param1,int param2,int param3)
    {
        super(param1,param2);
        this.param3=param3;
    }
    childClass(childClass obj)
    {
        super(obj);
        this.param3=obj.param3;
    }

    public static void main(String[] args)
    {
        childClass c1=new childClass(1,2,3);
        childClass c2=new childClass(c1);
        Inheritance a1=new childClass(1,2,3); //reference variable is of base class and object is created of child class
        System.out.println(a1.param2); //can access this as it's defined in base class
        //System.out.println(a1.param3); cannot access param3 as reference variable is of base class (Inheritance)

        //you can access params only of reference variable type top to bottom approach (base to child)works for members of reference variable (i.e base class)

        //bottom to top approach gives error each time (child to base class)
        //childClass c2=new Inheritance(1,2);


    }
}
