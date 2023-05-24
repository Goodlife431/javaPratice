package chapter8;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public void setTime(int hour, int minute, int seconds) {
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || seconds < 0 || seconds > 24){
            throw new IllegalArgumentException("hour or seconds or minutes out of bond");
        };
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,seconds);
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",((hour == 0 || hour == 12) ? 12 : hour % 12),minute,seconds,(hour < 12 ? "AM" : "PM"));
    }
    public static void displayTime(String header, Time t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toUniversalString(), t.toString());
    }
}
