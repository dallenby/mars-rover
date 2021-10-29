import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    public static final int FORWARD = 1;
    public static final int BACKWARDS = -1;
    public static final List<String> LEFT = Arrays.asList("W", "S", "E", "N");
    public static final List<String> RIGHT = Arrays.asList("N", "E", "S", "W");
    private int y;
    private String direction;
    private int x;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String commands) {
        char[] splitCommands = commands.toCharArray();

        for (int i = 0; i < splitCommands.length; i++) {
            char command = splitCommands[i];
            if (command == 'R') {
                turn(RIGHT);
            }
            if(command == 'L') {
                turn(LEFT);
            }
            if (command == 'F') {
                move(FORWARD);
            }
            if (command == 'B') {
                move(BACKWARDS);
            }
        }


    }

    private void turn(List<String> compass) {
        direction = compass.get((compass.indexOf(direction) + 1) % 4);
    }

    private void move(int distance) {
        switch (direction) {
            case "N":
                y += distance;
                break;
            case "E":
                x += distance;
                break;
            case "S":
                y -= distance;
                break;
            case "W":
                x -= distance;
                break;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getDirection() {
        return direction;
    }
}
