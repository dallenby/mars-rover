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
        if (commands == "F") {
            move(FORWARD);
        } else {
            move(BACKWARDS);
        }
    }

    private void move(int distance) {
        if (direction == "N") {
            y+= distance;
        }
        if (direction == "E") {
            x+= distance;
        }
        if (direction == "S") {
            y-= distance;
        }
        if (direction == "W") {
            x-= distance;
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
