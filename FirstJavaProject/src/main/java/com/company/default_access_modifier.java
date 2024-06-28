//Disclaimer: Very very very Exhausted after this !!!!!!!!SMALL PIECE OF CODE!!!!!!!!!!!

package com.company;

interface Camera{
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
interface WiFi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{

    void callNum(int ph){
        System.out.println("Calling " + ph + " .");
    }
    void pickNum(int ph){
        System.out.println("Connecting...");
    }
}
class SM extends MyCellPhone implements WiFi, Camera{
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
public class default_access_modifier {
    public static void main(String[] args) {
        SM ms = new SM();
        ms.WIFINOTWELL();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
