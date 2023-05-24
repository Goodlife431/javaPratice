package chapter8;

public class TVTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(30);
        tv.setVolumeLevel(3);

        TV tv1 = new TV();
        tv1.turnOn();
        tv1.channelUp();
        tv1.channelUp();
        tv1.chanelDown();

        System.out.println("tv volume level is "+tv.volumeLevel+ "tv channel is"+tv.channel);

        
    }
}
