package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Вам необходимо выполнить следующее:
 *
 * - заполнить список numbers значениями, т.е. вместо ... указать значения чисел, которыми будет заполнен наш список - это должны быть как положительные числа так и отрицательные;
 *
 * - вместо ... в методе filter() надо записать условие таким образом, чтобы в потоке остались только положительные числа (0 это не положительное число и не отрицательное);
 *
 * - вместо ... в методе collect() надо записать коллектор, который позволит собрать элементы потока с список.
 */

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, 6, 8);
        List<Integer> positive = numbers.stream().filter(e -> e > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}