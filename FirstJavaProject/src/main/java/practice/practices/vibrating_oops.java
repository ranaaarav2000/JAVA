package practice.practices;


class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("Vibrating...");

    }
}
public class vibrating_oops {
    public static void main(String[] args) {
        cellphone phone = new cellphone();
        phone.ring();
        phone.vibrating();
    }
}
