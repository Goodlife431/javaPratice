package chapter7;

public class ArrayColours {
    public static void main(String[] args) {
        String [] colours;
        colours = new String[7];

        colours[0] ="blue";
        colours[1] = "red";
        colours[2] = "orange";
        colours[3] = "purple";
        colours[4] = "white";
        colours[5] = "black";
        colours[6] = "brown";

        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}
