public class MarsRover {
    private int y;
    private String direction;
    private int x;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(String commands) {
        if (commands == "F") {
            if (direction == "S") {
                y--;
            }
            if (direction == "N") {
                y++;
            }
            if (direction == "W") {
                x--;
            }
            if (direction == "E") {
                x++;
            }
        }
        else {
            if(direction == "N")
            {
                y--;
            }
            if(direction == "S")
            {
                y++;
            }
        }
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
