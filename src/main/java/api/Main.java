package api;
import java.util.Arrays;
import java.util.List;
//import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        /*
        ArrayList<Integer> list = new ArrayList<>();
                list.add(4);
        list.add(3);
        list.add(12);
        list.add(32);
        list.add(18);
        list.add(22);
        OptionalDouble average = list.stream()
                        .mapToInt(Integer::intValue)
                                .average();
                                System.out.println(average.getAsDouble());
*/
         nums.stream().
                mapToDouble(Integer::doubleValue)
                .average()
                 .ifPresent(avg -> System.out.println(avg));


    }

}