package practice.practices;



class qq extends Thread{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
class qq1 extends Thread{
    @Override
    public void run() {
        System.out.println("Hello bro");
    }
}
public class getp_setp {
    public static void main(String[] args) {
        qq n = new qq();
        qq1 n1 = new qq1();
        n.setPriority(Thread.MAX_PRIORITY);
        n1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(n.getPriority());
        System.out.println(n1.getPriority());
        n.start();
        n1.start();
    }
}
