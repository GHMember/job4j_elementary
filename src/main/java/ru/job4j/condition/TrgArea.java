package ru.job4j.condition;

public class TrgArea {
    public static double semiperimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public static double area(double a, double b, double c) {
        double p = semiperimeter(a, b, c);
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
