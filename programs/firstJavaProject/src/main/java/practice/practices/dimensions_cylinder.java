package practice.practices;

class cylinder_dimensions{
    int surface;
    int volume;
    public cylinder_dimensions(){
        surface = 40;
        volume = 80;
    }
    public int getRadius(){
        return surface;
    }
    public int getDiameter(){
        return volume;
    }
}
public class dimensions_cylinder {
    public static void main(String[] args) {
        cylinder_dimensions dimensions = new cylinder_dimensions();
        System.out.println("The surface of the cylinder is "+dimensions.getRadius());
        System.out.println("The volume of the cylinder is "+dimensions.getDiameter());
    }
}
