import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverTest {

    @Test
    public void moveForwardNorthBy1() {
        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.move("F");

        assertEquals(1, marsRover.getY());
    }
}
