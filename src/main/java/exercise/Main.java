package exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(223);
        list.add(110);
        list.add(23);
        list.add(14);
        list.add(7);
        list.add(13);
        list.add(12);
        System.out.println( list.stream()
                .mapToInt(Integer::intValue)
                .filter(i -> i % 2 == 0)
                .sum());
        System.out.println( list.stream()
                .mapToInt(Integer::intValue)
                .filter(i -> i % 2 != 0)
                .sum());




    }
}