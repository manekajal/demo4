import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,3,6,8,2,7,4);
        System.out.println(" Hello");

             Stream<Integer> integerStream= list.stream().
                                            filter(n ->n%2 ==0);


                  Stream<Integer>sorted = integerStream.sorted();

                  sorted.forEach(n -> System.out.println(n));
//                                                .filter(n -> n%2==0)
//
//                                    .map(n ->n/2);

                                                                                                        ;


       // System.out.println(sorted);



    }
}
