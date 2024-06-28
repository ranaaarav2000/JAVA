package practice.practices;

abstract class pen{
    abstract void Refill();
    abstract void Write();
}
class fountainPen extends pen{
     void Refill(){
        System.out.println("Refilling");
    }
    void Write(){
        System.out.println("Writing");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class Abstract_classes_and_methods_piece_of_cake {
    public static void main(String[] args) {
        fountainPen a = new fountainPen();
        a.changeNib();
    }
}
