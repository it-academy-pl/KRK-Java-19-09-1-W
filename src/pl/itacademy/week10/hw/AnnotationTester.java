package pl.itacademy.week10.hw;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationTester {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        AnnotatedClass annotatedClass = new AnnotatedClass();

        Method[] methods = annotatedClass.getClass().getDeclaredMethods();
        for (Method method : methods) {
            int times = 0;
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation instanceof Execute) {
                    Execute execute = (Execute) annotation;
                    times = execute.times();
                }
            }
            for (int i = 0; i < times; i++) {
                Parameter[] parameters = method.getParameters();
                Object[] parameterValues = new Object[parameters.length];
                for (int j = 0; j < parameters.length; j++) {
                    Class<?> type = parameters[j].getType();
                    if(type.getName().equals("java.lang.String")) {
                        parameterValues[j] = "test" + j;
                    } else if (type.getName().equals("java.lang.Integer")) {
                        parameterValues[j] = j;
                    }
                }
                method.invoke(annotatedClass, parameterValues);
            }
        }

    }

    private static void executeTimes(Method method, int times, Object... args) {

    }
}
