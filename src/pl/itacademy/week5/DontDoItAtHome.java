package pl.itacademy.week5;

public class DontDoItAtHome {

    public static void sum(int a, int b) {
        System.out.println("int sum");
    }

//    public static void sum(Integer a, Integer b) {
//        System.out.println("Integer sum");
//    }

    public static void sum(short a, short b) {
        System.out.println("Short sum");
    }

    public static void sum(Object a, Object b) {
        System.out.println("Object sum");
    }

    public static void main(String[] args) {
        short a = 1;
        short b = 2;
        sum(new Integer(3), new Integer(5));
    }

}
