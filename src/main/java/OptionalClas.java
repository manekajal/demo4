import java.util.Optional;

public class OptionalClas {

    //Option class used for nullpointerExpetion ... it provides method which are used to check presence of value of perticular variable.
    public static void main(String[] args) {
//      String str[]= new String[12];
//       str[3]="Kajal";
//
//      Optional<String> string = Optional.ofNullable(str[3]);
//        if(string.isPresent()) {
//           String name = str[3];
//          System.out.println(name);
//        }
//        else {
//            System.out.println(" not present");
//        }


        //int arr[]=new int[2];

       int  arr1[] ={1,2} ;
        Optional<Integer> inout = Optional.empty();

        if (inout.isEmpty()){
            int s = Integer.parseInt(String.valueOf(arr1.length));

            System.out.println(s);
            System.out.println("not empty");
        }
        else {
            System.out.println(" is empty");
        }



    }



}
