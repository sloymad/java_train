package ru.stqa.ptf.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Hello, world");
    }
=======
        hello("world");
        hello("user");
        hello("Alexei");

        double l = 5;
        System.out.println("Площадь кв со сторной " + l + " = " + area(l));

        double a = 4;
        double b = 6;

        System.out.println("Gkjoflm ghzvjeu"+ a + "и" + b + " = " + area(a, b));
    }

    public static void hello (String somebody) {

        System.out.println( "Hello, " + somebody + "!");
    }

    public static double area(double len) {
        return len * len;
    }

    public static double area(double a, double b) {
        return a * b;
    }
>>>>>>> parent of a6f45f7... Добавлен Gradle и TestNG
}
