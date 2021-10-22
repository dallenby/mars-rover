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
        if (direction == "S") {
            y--;
        }
        if (direction == "N") {
            y++;
        }
        x++;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
