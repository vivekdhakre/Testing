package geeksforgeeks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ahoy on 5/5/17.
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(number);
//        System.out.println(square);
//        number.stream().map(x->x*x).forEach(y->System.out.println(y));
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> {
            System.out.println("ans: " + ans + " | i: " + i);
            return ans + i;
        });
        System.out.println(even);

//        List<String> names = Arrays.asList("Reflection","Collection","Stream");
//        List<String> filter = names.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
//        System.out.println(names);
//        System.out.println(filter);

//        List<String> sortList = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortList);
    }
}
