package ru.job4j.array;

public class Defragment {
    static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index; i + 1 < array.length && array[index] == null; i++) {
                    array[index] = array[i + 1];
                    array[i + 1] = null;
                }
            }
        }
        return array;
    }
}
