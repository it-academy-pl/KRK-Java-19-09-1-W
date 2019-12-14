package pl.itacademy.week10.hw;

public class AnnotatedClass {

    @Execute(times = 3)
    public void firstMethod() {
        System.out.println("Execution of the first method");
    }

    public void secondMethod(String text) {
        System.out.println("Execution of second method with text " + text);
    }

    @Execute(times = 5)
    public void thirdMethod(String text, Integer number) {
        System.out.println("Execution of third method with text " + text + " and number " + number);
    }
}
