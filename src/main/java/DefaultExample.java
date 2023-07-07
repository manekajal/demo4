
interface Student1
{
    public void hello();

    public default void hellooo(){

    }
//    public static  void hello1(){
//       thhth
//    }

}

public class DefaultExample implements Student1 {

    public static void main(String[] args) {
       DefaultExample defaultExample = new DefaultExample();
       defaultExample.hello();
    }


    @Override
    public void hello() {

    }
}
