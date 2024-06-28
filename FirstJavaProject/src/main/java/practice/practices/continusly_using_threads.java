package practice.practices;



class lol extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good Morning");
        }

    }
}
class lol2 extends Thread{
    public void run() {
    while (true){
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Welcome");
         }
    }
}
public class continusly_using_threads {
    public static void main(String[] args) {
        lol t1 = new lol();
        lol2 t2 = new lol2();
        t2.start();
        t1.start();
    }
}
