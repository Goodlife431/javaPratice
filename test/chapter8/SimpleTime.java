package chapter8;

public class SimpleTime {
    private final int hour;
    private final int minute;
    private final int seconds;

    public SimpleTime(int hour, int seconds, int minute){
          this.hour = hour;
          this.minute = minute;
          this.seconds = seconds;
    }
public String buildString(){
        return String.format("%24s: %s%n%24s: %s","this.toUniversalString()",this.toUniversalString(), "this.toUniversalString()",this.toUniversalString()
        );
}

    private String toUniversalString() {
       return String.format("%02d: %02d: %02d",this.hour,this.minute,this.seconds);
    }

    public static void main(String[] args) {
        SimpleTime time2 = new SimpleTime(15,30,19);
        System.out.println(time2.buildString());
    }
}
