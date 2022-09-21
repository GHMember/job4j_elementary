package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean test = !(name.isEmpty() || Character.isUpperCase(name.charAt(0)) || Character.isDigit(name.charAt(0)));
        if (test) {
            for (int i = 0; i < name.length(); i++) {
               if (!(isSpecialSymbol(name.codePointAt(i)) || isUpperLatinLetter(name.codePointAt(i))
                        || isLowerLatinLetter(name.codePointAt(i)) || Character.isDigit(name.charAt(i)))) {
                   test = false;
                   break;
               }
            }
        }
        return test;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}