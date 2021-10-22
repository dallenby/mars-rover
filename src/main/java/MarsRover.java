public class MarsRover {
    private int y;

    public MarsRover(int x, int y, String direction) {
        this.y = y;
    }

    public void move(String commands) {
        y++;
    }

    public int getY() {
        return y;
    }
}
