package practice.practices;


class salary{
    int s;
    String name;
    public int getSalary(){
        return s;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class oops {
    public static void main(String[] args) {
        salary my = new salary();
        my.s = 9400000;
        my.setName("Erik Tyson");
        System.out.println("Hello there everyone!I am new in this company, so i would like to introduce me to you guys");
        System.out.println("My salary is "+my.getSalary());
        System.out.println("My name is "+my.getName());

    }
}
