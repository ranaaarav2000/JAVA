package practice.practices;
class cylinder{
    int radius;
    int diamaeter;
    public cylinder(){
        radius = 40;
        diamaeter = 80;
    }
    public int getRadius(){
        return radius;
    }
    public int getDiamaeter(){
        return diamaeter;
    }
}
public class cylinder_constructor {
    public static void main(String[] args) {
        cylinder dimensions = new cylinder();
        System.out.println("The radius of the circle is "+dimensions.getRadius());
        System.out.println("The diameter of the circle is 2 times its radius and is "+dimensions.getDiamaeter());
    }
}
