package geeksforgeeks;

import java.io.File;

/**
 * Created by ahoy on 5/5/17.
 */
public class Test {

    public static void main(String[] args) {
//        List<Integer> number = Arrays.asList(2, 3, 4, 5);
//        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
////        System.out.println(number);
////        System.out.println(square);
////        number.stream().map(x->x*x).forEach(y->System.out.println(y));
//        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> {
//            System.out.println("ans: " + ans + " | i: " + i);
//            return ans + i;
//        });
//        System.out.println(even);

//        List<String> names = Arrays.asList("Reflection","Collection","Stream");
//        List<String> filter = names.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());
//        System.out.println(names);
//        System.out.println(filter);

//        List<String> sortList = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortList);

        File f = new File("/home/applogs/marketeer/rawimages/Food/200x200");
        File[] files = f.listFiles();
        System.out.println(files.length);
        System.out.println(files);

        for (File f1 : files) {
            System.out.println(f1.getName());
        }
    }
}
