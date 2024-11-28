package exercise;
// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Xlox", "XDEd", "LLLL", "xLjo", "Slow","Fast","Fastest");
        AtomicInteger i = new AtomicInteger();
    strings.stream()
                .filter(s -> ( s.charAt(0)== 'X'))
            .forEach( x -> i.getAndIncrement());
    System.out.println(i);
    }
}