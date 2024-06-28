package practice.practices;


interface tvRemote{
    void volumeUp();
    void volumeDown();
}
interface smartTvRemote extends tvRemote{
    void search();
    void Microphone();
}
class Tv implements smartTvRemote, tvRemote{
    public void search(){
        System.out.println("Search here..");
    }
    public void Microphone(){
        System.out.println("Please tell what you need in the microphone");
    }
    public void volumeUp(){
        System.out.println("Volume up");
    }
    public void volumeDown(){
        System.out.println("Volume down");
    }
}
public class Interface_tvRemote_Interface_SmartTv_Remote_TV {
    public static void main(String[] args) {
        tvRemote n = new Tv();
        smartTvRemote ne = new Tv();
        n.volumeDown();
        n.volumeUp();
        ne.Microphone();
        ne.search();
        ne.volumeDown();
        ne.volumeUp();
    }
}
