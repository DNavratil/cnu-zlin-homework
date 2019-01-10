package dk.cngroup.university;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class DirectionTest {
	@Test
	void testTurnRightFromEast() {
		testTurnRight(Direction.EAST, Direction.SOUTH, "South should be right of east");
	}

	@Test
	void testTurnRightFromSouth() {
		testTurnRight(Direction.SOUTH, Direction.WEST, "West should be right of south");
	}

	@Test
	void testTurnRightFromWest() {
		testTurnRight(Direction.WEST, Direction.NORTH, "North should be right of west");
	}

	@Test
	void testTurnRightFromNorth() {
		testTurnRight(Direction.NORTH, Direction.EAST, "East should be right of north");
	}

	// Left
    @Test
    void testTurnLeftFromEast() {
        testTurnLeft(Direction.EAST, Direction.NORTH, "South should be left of north");
    }

    @Test
    void testTurnLeftFromSouth() {
        testTurnLeft(Direction.SOUTH, Direction.EAST, "West should be left of east");
    }

    @Test
    void testTurnLeftFromWest() {
        testTurnLeft(Direction.WEST, Direction.SOUTH, "North should be left of south");
    }

    @Test
    void testTurnLeftFromNorth() {
        testTurnLeft(Direction.NORTH, Direction.WEST, "East should be left of west");
    }

    // Back
    @Test
    void testTurnBackFromEast() {
        testTurnBack(Direction.EAST, Direction.WEST, "South should be back of west");
    }

    @Test
    void testTurnBackFromSouth() {
        testTurnBack(Direction.SOUTH, Direction.NORTH, "West should be back of north");
    }

    @Test
    void testTurnBackFromWest() { testTurnBack(Direction.WEST, Direction.EAST, "North should be back of east");
    }

    @Test
    void testTurnBackFromNorth() {
        testTurnBack(Direction.NORTH, Direction.SOUTH, "East should be back of south");
    }

	private void testTurnRight(Direction input, Direction expected, String message) {
		Direction result = input.getDirectionOnRight();
		assertEquals(expected, result, message);
	}

    private void testTurnLeft(Direction input, Direction expected, String message) {
        Direction result = input.getDirectionOnLeft();
        assertEquals(expected, result, message);
    }

    private void testTurnBack(Direction input, Direction expected, String message) {
        Direction result = input.getDirectionBack();
        assertEquals(expected, result, message);
    }
}