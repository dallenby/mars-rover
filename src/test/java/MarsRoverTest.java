import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({
            "0,0,N,0,1",
            "0,0,E,1,0",
            "1,1,S,1,0",
            "1,1,W,0,1"
    })
    public void movingForward(int x, int y, String direction, int expectedX, int expectedY) {
        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.execute("F");
        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,N,1,0",
            "0,0,S,0,1",
            "1,1,E,0,1",
            "0,0,W,1,0"
    })
    public void moveBackwards(int x, int y, String direction, int expectedX, int expectedY) {
        MarsRover marsRover = new MarsRover(x, y, direction);
        marsRover.execute("B");
        assertEquals(expectedX, marsRover.getX());
        assertEquals(expectedY, marsRover.getY());
    }

    @ParameterizedTest
    @CsvSource({
            "N,E",
            "E,S",
            "S,W",
            "W,N"
    })
    public void turningRight(String direction, String expectedDirection) {
        MarsRover marsRover = new MarsRover(0, 0, direction);
        marsRover.execute("R");
        assertEquals(expectedDirection, marsRover.getDirection());
    }
}
