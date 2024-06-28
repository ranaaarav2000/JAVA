package practice.practices;



class circle{
    public void perimeter(){
        System.out.println("My perimeter is nothing");
    }
}


class cylinder1 extends circle{
    @Override
    public void perimeter(){
        System.out.println("My perimeter is also nothing");
    }
}
public class Inheritance_circle_cylinder {
    public static void main(String[] args) {
        circle a = new circle();
        cylinder1 b = new cylinder1();
        b.perimeter();
    }
}
