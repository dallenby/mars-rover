import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void moveForwardNorthBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.move("F");
        assertEquals(1, marsRover.getY());
    }

    @Test
    public void moveForwardEastBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.move("F");
        assertEquals(1, marsRover.getX());
    }

    @Test
    public void moveForwardSouthBy1() {
        MarsRover marsRover = new MarsRover(1,1, "S");
        marsRover.move("F");
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void moveForwardWestBy1() {
        MarsRover marsRover = new MarsRover(1, 1, "W");
        marsRover.move("F");
        assertEquals(0, marsRover.getX());
    }

    @Test
    public void moveBackwardsFacingNorthBy1() {
        MarsRover marsRover = new MarsRover(1, 1, "N");
        marsRover.move("B");
        assertEquals(0, marsRover.getY());
    }

    @Test
    public void moveBackwardsFacingSouthBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.move("B");
        assertEquals(1, marsRover.getY());
    }
}
