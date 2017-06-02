package java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ahoy on 29/5/17.
 */
public class TypeInference {

    public static void main(String[] args) {
//        Prior JDK 7
        Map<String, List<String>> employeeRecords = new HashMap<>();
        List<Integer> primes = new ArrayList<>();

//        In JDK 7
        Map<String, List<String>> employeeRecords1 = new HashMap<>();
        List<Integer> primes1 = new ArrayList<>();


    }
}
