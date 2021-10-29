import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarsRover {
    public static final int FORWARD = 1;
    public static final int BACKWARDS = -1;
    private int y;
    private String direction;
    private int x;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String commands) {
        if (commands == "R") {
            List<String> compass = Arrays.asList("N", "E", "S", "W");
            direction = compass.get((compass.indexOf(direction) + 1) % 4);
        }

        if (commands == "F") {
            move(FORWARD);
        }
        if (commands == "B") {
            move(BACKWARDS);
        }
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
