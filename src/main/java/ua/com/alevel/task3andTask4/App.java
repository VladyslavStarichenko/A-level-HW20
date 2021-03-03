package ua.com.alevel.task3andTask4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        ParentClass parentClass = new ParentClass();
        ClassWithoutAnnotation classWithoutAnnotation = new ClassWithoutAnnotation();

        List<String> listOfMarkedClasses = new ArrayList<>();

        inspectForService(childClass,listOfMarkedClasses);
        inspectForService(classWithoutAnnotation,listOfMarkedClasses);
        inspectForService(parentClass,listOfMarkedClasses);

        System.out.println(listOfMarkedClasses);
    }

    private static <T> void inspectForService(T classToCheck, List<String> listOfMarkedClasses) {

        if(classToCheck.getClass().isAnnotationPresent(Service.class)){
            System.out.println("Annotation is present.");
            listOfMarkedClasses.add(classToCheck.getClass().getSimpleName());
        }else if(!classToCheck.getClass().isAnnotationPresent(Service.class)){
            System.out.println("There is no Service annotation under the class.");
        }
    }

}
