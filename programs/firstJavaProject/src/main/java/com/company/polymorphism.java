package com.company;


interface Camera2{
    void takeSnap();
    void recordVideo();
    private void greetBoy(){
        System.out.print("Good Morning.");
    }
    default void WIFINOTWELL(){
        greetBoy();
        System.out.println(" Your WiFi seems not well.");
    }
}
interface WiFi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{

    void callNum(int ph){
        System.out.println("Calling " + ph + " .");
    }
    void pickNum(int ph){
        System.out.println("Connecting...");
    }
}
class SM2 extends MyCellPhone implements WiFi2, Camera2{
    public void takeSnap(){
        System.out.println("Taking a picture.");
    }
    public void recordVideo(){
        System.out.println("Recording...");
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network + " .");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks...");
        String[] networkList = {"Anjali 5g_32_:)", "RANAs", "2305G"};
        return networkList;
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new SM2();
//        cam1.getNetworks(); --> Not allowed for good
    }
}
