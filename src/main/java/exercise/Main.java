package exercise;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(36, 1, 4, 3, 3, 3, 6, 3, 6, 8, 10, 18, 36);
        List< Integer > list = nums.stream()
               .distinct()
               .collect(Collectors.toList());
        System.out.println(list);

    }
}