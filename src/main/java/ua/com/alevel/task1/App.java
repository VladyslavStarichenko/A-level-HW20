package ua.com.alevel.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<TestClass> testClassClass = TestClass.class;

        try {
            Constructor<?> constructor = testClassClass.getDeclaredConstructor();
            setAccessibleConstructor(constructor);
            TestClass testClass =  (TestClass) constructor.newInstance();
            Field field_id = testClass.getClass().getDeclaredField("id");
            Field field_name = testClass.getClass().getDeclaredField("name");
            System.out.println("Before changing:");
            System.out.println(testClass);
            setAccessibleTrue(field_id);
            setAccessibleTrue(field_name);
            field_id.set(testClass,"12345");
            field_name.set(testClass, "Vlad");
            setAccessibleFalse(field_id);
            setAccessibleFalse(field_name);
            System.out.println("After changing:");
            System.out.println(testClass);
        } catch (NoSuchMethodException | NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void setAccessibleConstructor(Constructor<?> constructor) {
        constructor.setAccessible(true);
    }

    private static void setAccessibleFalse(Field field) {
        field.setAccessible(false);
    }

    private static void setAccessibleTrue(Field field) {
        field.setAccessible(true);
    }
}
