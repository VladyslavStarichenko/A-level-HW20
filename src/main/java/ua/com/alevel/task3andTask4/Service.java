package ua.com.alevel.task3andTask4;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Service {
boolean isOk() default true;
}
