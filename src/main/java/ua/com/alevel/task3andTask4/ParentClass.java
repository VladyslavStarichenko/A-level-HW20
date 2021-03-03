package ua.com.alevel.task3andTask4;

import ua.com.alevel.task2.Value;

@Service()
public class ParentClass {
    @Value(value = "name for parent")
    String name;

    @Value()
    String id;

    @Init
    static void printHello(Object obj){
        System.out.println(obj.toString());
    }
    @Override
    public String toString() {
        return "ParentClass{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
