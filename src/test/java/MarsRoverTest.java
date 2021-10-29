import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void moveForwardNorthBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.execute("F");
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void moveForwardEastBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.execute("F");
        assertEquals(1, marsRover.getX());
    }

    @Test
    public void moveForwardSouthBy1() {
        MarsRover marsRover = new MarsRover(1,1, "S");
        marsRover.execute("F");
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void moveForwardWestBy1() {
        MarsRover marsRover = new MarsRover(1, 1, "W");
        marsRover.execute("F");
        assertEquals(0, marsRover.getX());
    }

    @Test
    public void moveBackwardsFacingNorthBy1() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.execute("B");
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void moveBackwardsFacingSouthBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.execute("B");
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void moveBackwardsFacingEastBy1() {
        MarsRover marsRover = new MarsRover(1,1, "E");
        marsRover.execute("B");
        assertEquals(0, marsRover.getX());
    }

    @Test
    public void moveBackwardsFacingWestBy1() {
        MarsRover marsRover = new MarsRover(0,0, "W");
        marsRover.execute("B");
        assertEquals(1, marsRover.getX());
    }
}
