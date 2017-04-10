import javax.sql.rowset.CachedRowSet;
import java.util.*;
import java.util.concurrent.ExecutionException;

/**
 * Created by vivek on 26/12/16.
 */
public class Java8 {

    public static void main(String[] args) throws Exception{


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        System.out.println(names);


//      Before Java 8
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return a.compareTo(b);
//            }
//        });

//        From java 8

//        Collections.sort(names,(String a,String b) ->{return a.compareTo(b);} );
        names.sort((a,b) -> a.compareTo(b));

        System.out.println(names);

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//
//        System.out.println(sumIterator(list));
//        System.out.println(sumStream(list));


//        Integer value1 = null;
//        Integer value2 = new Integer(10);
//
//        //Optional.ofNullable - allows passed parameter to be null.
//        Optional<Integer> a = Optional.ofNullable(value1);
//
//        //Optional.of - throws NullPointerException if passed parameter is null
//        Optional<Integer> b = Optional.of(value2);
//        System.out.println(sum(a,b));
//
//        List<Integer> list = null;
//        Optional<List<Integer>> optList = Optional.ofNullable(list);
//        System.out.println(getList(optList));

        try
        {
//            String str ="bbbbbbbbb";
//            Optional nonEmptyOptional = Optional.of( str );
//            System.out.println(nonEmptyOptional.isPresent());
//        /* empty */
//            Optional emptyOptional = Optional.empty();
//            System.out.println( emptyOptional.isPresent());

//            String strNull = null;
//            Optional nullableOptional = Optional.of( strNull );
//            System.out.println(nullableOptional.get());


//            String carNull = null;
//            Optional optionalCarNull = Optional.ofNullable( carNull );
//            optionalCarNull.orElseThrow( IllegalStateException::new );

//            Optional stringToUse = Optional.of( "optional is there" );
//            stringToUse.ifPresent( System.out::println );



            //Car x = new Car();

            // if the value is not present
//            Optional carOptionalEmpty = Optional.empty();
//            carOptionalEmpty.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );
//
//            // if the value does not pass the filter
//            Optional carOptionalExpensive = Optional.of( new Car( "3333" ) );
//            carOptionalExpensive.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );
//
//            // if the value is present and does pass the filter
//            Optional carOptionalOk = Optional.of( new Car( "250" ) );
//            carOptionalOk.filter( x -> "250".equals( x.getPrice() ) ).ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );

        }
	catch (Exception e){
            System.out.println(e);
        }

    }

    private static int sumStream(List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        return sum;
    }

    public static Integer sum(Optional<Integer> a, Optional<Integer> b){

        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(new Integer(0));

        //Optional.get - gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }

    public static List<Integer> getList(Optional<List<Integer>> list){

        //Optional.isPresent - checks the value is present or not

        System.out.println("First parameter is present: " + list.isPresent());
       // System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse - returns the value if present otherwise returns
        //the default value passed.
       List<Integer> list1 = list.orElse(new ArrayList<>());

       return list1;

    }
}

