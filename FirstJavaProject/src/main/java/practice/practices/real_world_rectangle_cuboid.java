package practice.practices;



class rec {
    rec() {
        System.out.println("Hello. i am nothing");
    }
    rec(int x) {
        System.out.println("I am a rectangle, short for rec. My perimeter is " + x);
    }
}
class cub extends rec{
    cub(){
        System.out.println("I am a cuboid. I look similar to my friend rectangle(Rec). I have 8 sides");
    }
    cub(int x ,int  y ){
        super(x);
        System.out.println("I am a cuboid. I look similar to my friend rectangle(Rec). I have 8 sides. My perimeter is " +y);
    }
}
public class real_world_rectangle_cuboid {
    public static void main(String[] args) {
        cub ab = new cub(4,6);
    }
}
