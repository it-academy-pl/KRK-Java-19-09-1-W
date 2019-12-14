package pl.itacademy.week10;

import java.lang.annotation.*;

@Repeatable(Schedule.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TimeSlot {
    String value() default "";
    String something() default "";
    int number() default 0;
    double person() default 0.0;
    long test() default 1L;
}
