package api;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bye");
        list.add("Or");
        list.add("Hello");
        list.add("");
        list.add("");
        list.add("Meow");
        list.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
        list.stream().map( s -> s.hashCode())
                .forEach(System.out::println);
        list.stream().forEach(System.out::println);

        }


}