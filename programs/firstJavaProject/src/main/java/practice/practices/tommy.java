package practice.practices;

class Tommy_Vercetty{
    public void hitting(){
        System.out.println("Hitting the enemy...");
    }
    public void running(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing on the enemy...");
    }
}

public class tommy{
    public static void main(String[] args) {
        Tommy_Vercetty actions = new Tommy_Vercetty();
        actions.hitting();
        actions.firing();
        actions.running();
    }
}
