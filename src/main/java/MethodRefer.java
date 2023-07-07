

@FunctionalInterface
interface Student{

    public void display( String name);

   // public void display();
}


public class MethodRefer {

    private static String name ="kajal";

    public void Hello(String name){

        this.name=name;
        System.out.println(name);
        System.out.println(" welcome");

        System.out.println("HIIII");
    }



//    public static void demo(){
//        System.out.println("  Bridgelabz");
//    }

    public static void main(String[] args) {
//
//        Student stu = MethodRefer::demo;
//        stu.display();

    Student student=new MethodRefer()::Hello;
        student.display("kajal");
//
    }
}
