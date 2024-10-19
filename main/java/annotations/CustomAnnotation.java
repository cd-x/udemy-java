package main.java.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
    String name() default "Rajrishi Vishwakarma";
    String annotationVersion()  default "1.0";
}
