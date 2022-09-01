package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfDifferenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumOfAllBasicMathOperations(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета первой операции равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета второй операции равен: " + sumOfDifferenceAndDivision(20, 10));
        System.out.println("Результат расчета третьей операции равен: " + sumOfAllBasicMathOperations(20, 10));
    }
}