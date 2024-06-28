package practice.practices;


interface basicAnimal{
    void eat();
    void sleep();
}
class monkey{
    void jump(){
        System.out.println("Jumping");
    }
    void bite(){
        System.out.println("Biting");
    }
}

class human extends monkey implements basicAnimal{
    @Override
    public void eat(){
        System.out.println("Lets eat some bananas...");
    }
    @Override
    public void sleep(){
        System.out.println("HOOUUuuuuuuuuuUUUUw,lets sleep");
    }
    public void talk(){
        System.out.println("Talking...");
    }
    public void walk(){
        System.out.println("Lets take a walk");
    }
}
public class two_classes_1_interface {
    public static void main(String[] args) {
        basicAnimal n = new human();
        human na = new human();
        monkey naa = new human();
    }
}
