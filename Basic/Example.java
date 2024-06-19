package Basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example implements Cloneable {
    public void display() {
        System.out.println("Object created");
    }

    public static void main(String[] args) throws Exception {
        //using class.forName()
        Class c = Class.forName("Basic.Example");
        Example ex = (Example) c.getDeclaredConstructor().newInstance();

        // Using Reflection
//        Constructor cons = Example.class.getDeclaredConstructor();
//        Example ex = (Example) cons.newInstance();

        // Using Clone
//        Example original = new Example();
//        Example ex = (Example) original.clone();

        ex.display();

    }
}
