package ua.com.alevel.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) {
        TestClassForAnnotation testClass = createInstance(TestClassForAnnotation.class);

        System.out.println(testClass.getName());
        System.out.println(testClass.getId());

        TestClass2 testClass2 = createInstance(TestClass2.class);

        System.out.println(testClass2);
    }


    private static <T> T createInstance(Class<T> testClassClass) {

        try {
            Constructor constructor = testClassClass.getConstructor();
            T testClass = (T) constructor.newInstance();
            initializeObject(testClass);
            return testClass;
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            System.out.println("Object can't be created.");
        }

        return null;
    }

    private static <T> void initializeObject(T testClass) throws IllegalAccessException {
        Field[] fields = testClass.getClass().getDeclaredFields();
        for(Field field : fields){
            Value annotationValue = field.getAnnotation(Value.class);
            if(field.isAnnotationPresent(Value.class)){
                String value  = annotationValue.value();
                field.setAccessible(true);
                field.set(testClass,value);
                field.setAccessible(false);
            }

        }
    }
}
