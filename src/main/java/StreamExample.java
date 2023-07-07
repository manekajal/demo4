import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,7,5,8);
                list.stream()
                        .filter(n -> n%2==1)
                //  .map(n -> n*2)
                        .collect(Collectors.toList())
           .forEach(n -> System.out.println(n));




      //  System.out.println(integerStream);

//     System.out.println(list);
       // list.forEach(n -> System.out.println(n));
       //integerStream.forEach(n -> System.out.println(n));
    }
}
