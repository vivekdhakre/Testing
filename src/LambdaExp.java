import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by vivek on 24/11/16.
 */
public class LambdaExp {

    public static void main(String[] args){

//        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println(strings);
//        System.out.println(filtered);

//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        //get list of unique squares
//        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
//        System.out.println(numbers);
//        System.out.println(squaresList);


//        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        //get count of empty string
//        long count = strings.stream().filter(string -> !string.isEmpty()).count();
//        System.out.println(count);

//        Random random = new Random();
//        random.ints().limit(10).sorted().forEach(System.out::println);

//        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        System.out.println("Filtered List: " + filtered);
//        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(""));
//        System.out.println("Merged String: " + mergedString);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
//        stats.










//
//        Runnable r = () -> System.out.println("Test2feb");
//
//
//        new Thread(
//                () -> System.out.println("hello world")
//        ).start();
//
//        Consumer<Integer> c = (Integer x) -> { System.out.println(x) ;};
//
//        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);

//        Predicate<String> p = (String s) -> { s == null };






    }
}
