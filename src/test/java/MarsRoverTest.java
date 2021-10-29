import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({"0,0,N,0,1", "0,0,E,1,0", "1,1,S,1,0", "1,1,W,0,1"})
    public void movingForward(int x, int y, String direction, int expectedX, int expectedY) {
        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.execute("F");
        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
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
