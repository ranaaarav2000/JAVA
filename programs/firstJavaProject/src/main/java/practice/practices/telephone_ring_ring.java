package practice.practices;


abstract class telephone{
    abstract void ring();
    abstract void disconnect();
    abstract void lift();
}
class SmartTelephone extends telephone{
    public void ring(){
        System.out.println("Ringing.....");
    }
    public void disconnect(){
        System.out.println("Phone disconnected!");
    }
    public void lift(){
        System.out.println("Prakash is ringing! Pick?");
    }
    public void speakToCaller(){
        System.out.println("Aur bhai kaisa h????");
    }
}
public class telephone_ring_ring {
    public static void main(String[] args) {
        telephone n = new SmartTelephone();
        n.lift();
        n.disconnect();
        n.ring();
        SmartTelephone sm = new SmartTelephone();
        sm.speakToCaller();
    }
}
