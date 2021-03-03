package ua.com.alevel.task2;

public class TestClassForAnnotation {

    @Value(value = "Vlad")
    private String name;

    @Value(value = "12345")
    private String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
