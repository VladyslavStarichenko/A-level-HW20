package ua.com.alevel.task1;

public class TestClass {
    private String id = "123";
    private String name = "Test";

    private TestClass() {
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}