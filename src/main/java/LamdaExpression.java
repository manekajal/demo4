import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@
interface Draw{
   // public String hii();

 //   public int width(int h , int l);


}


public class LamdaExpression {



    public static void main(String[] args) {
////
//                int width=4;
//
//       Draw draw =(h,l) ->(h*l) ;
//           System.out.println(draw.width(2,5));
//
//           Draw draw1 =(int h,int l) ->(h+l);
//        System.out.println(draw1.width(9,8));


        List<String> list=new ArrayList<>();

        list.add("kajal");
        list.add("Monika");


        Iterator<String> mylist =list.listIterator();
        while (mylist.hasNext()){
            String s=mylist.next();
            System.out.println(s);
        }

        System.out.println(list);

        list.forEach((n) -> System.out.println(n));







    }


}
