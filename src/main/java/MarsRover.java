public class MarsRover {
    private int y;
    private int x;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
    }

    public void move(String commands) {
        y++;
        x++;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
