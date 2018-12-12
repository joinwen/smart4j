package test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestDemo {
    @Test
    public void TestInteger() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Integer i=new Integer(12);
        Constructor<Integer> constructor = Integer.class.getConstructor(Integer.TYPE);
        Integer i2 = constructor.newInstance(12);
        System.out.println(i2);
    }
}
