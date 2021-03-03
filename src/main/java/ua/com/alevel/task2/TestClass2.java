package ua.com.alevel.task2;

public class TestClass2 {
    @Value ()
    private String name;

    @Value(value = "id for testClass2")
    private String id;

    @Override
    public String toString() {
        return "TestClass2{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
