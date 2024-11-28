package api;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> isPresent = s -> !s.isEmpty();
        System.out.println(isPresent.test("HIHI"));
        System.out.println(isPresent.test(""));
    }
}