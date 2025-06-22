package Collections;

import java.lang.reflect.Method;
import java.util.function.Consumer;

public class MethodReferences {
    public void printer()
    {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        MethodReferences obj=new MethodReferences();
//        Consumer<Object> cons=obj::printer;
//        cons.accept(null);

        Runnable obj1= obj::printer;
        obj1.run();

    }


}
