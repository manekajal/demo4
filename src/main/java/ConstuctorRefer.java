
@FunctionalInterface
interface Message{
    ConstuctorRefer msg(String message);






}
public class ConstuctorRefer {

    ConstuctorRefer (String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        Message message=ConstuctorRefer::new;
        message.msg("welcome");
    }
}
