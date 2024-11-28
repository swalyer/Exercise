package exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 0, 4, 3, 4, 5, 6, 7, 2, 3, 10, 22, 34, 64);
        Optional<Integer> i = nums.stream()
                .distinct()
                .sorted(Comparator.comparingInt(b -> b))
                .skip(1)
                .findFirst();
        System.out.println(i.get());
        Optional<Integer> i1 = nums.stream()
                .distinct()
                .sorted(Comparator.comparingInt(a -> (int) a).reversed())
                .skip(1)
                .findFirst();
        System.out.println(i1.get());

    }
}