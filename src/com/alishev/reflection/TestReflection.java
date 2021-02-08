package com.alishev.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        Class classObject1 = Class.forName(scanner.next());
        Class classObject2 = Class.forName(scanner.next());
        String methodName = scanner.next();
        Method m = classObject1.getMethod(methodName, classObject2);
        Object object1 = classObject1.getDeclaredConstructor().newInstance();
        Object object2 = classObject2.getConstructor(String.class).newInstance("String value");

        m.invoke(object1, object2);
        System.out.println(object1);

    }
}
