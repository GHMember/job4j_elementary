package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to1() {
        int[] input = {2, 4, 6, 8, 10, 12, 14};
        int source = input.length - 2;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 12, 6, 8, 10, 4, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap4to1() {
        int[] input = {2, 4, -6, 8, 10, 12, 14};
        int source = input.length - 3;
        int dest = 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {2, 4, 10, 8, -6, 12, 14};
        assertThat(result).containsExactly(expected);
    }
}