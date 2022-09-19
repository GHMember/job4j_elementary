package ru.job4j.array;

public class Defragment {
    static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int counter = index + 1;
                for (int i = counter; i < array.length && array[i] == null; i++) {
                   counter++;
                }
                if (counter < array.length) {
                    array[index] = array[counter];
                    array[counter] = null;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {null, null, null, "I", "wanna", "be", "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
