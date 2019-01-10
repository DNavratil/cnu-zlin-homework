package dk.cngroup.university;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    @Test
    void performRightToAccessibleField() {
        Action right = Action.RIGHT;
        Rover rover = new Rover(Direction.WEST, new Position(0,0));

        ArrayList<Position> accessibleFiled = new ArrayList<>();
        accessibleFiled.add(new Position(3,0));
        accessibleFiled.add(new Position(1,3));
        accessibleFiled.add(new Position(4,3));
        accessibleFiled.add(new Position(1,5));

        Landscape landscape = new Landscape(6, accessibleFiled);

        Rover result = right.perform(rover, landscape);
        Rover expected = new Rover(Direction.NORTH, new Position(0,0));
        assertEquals(expected, result, "Rover should be right");
    }

    @Test
    void performLeftToAccessibleField() {
        Action right = Action.LEFT;
        Rover rover = new Rover(Direction.WEST, new Position(0,0));

        ArrayList<Position> accessibleFiled = new ArrayList<>();
        accessibleFiled.add(new Position(3,0));
        accessibleFiled.add(new Position(1,3));
        accessibleFiled.add(new Position(4,3));
        accessibleFiled.add(new Position(1,5));

        Landscape landscape = new Landscape(6, accessibleFiled);

        Rover result = right.perform(rover, landscape);
        Rover expected = new Rover(Direction.SOUTH, new Position(0,0));
        assertEquals(expected, result, "Rover should be left");
    }

    @Test
    void performForwardToAccessibleField() {
        Action forward = Action.FORWARD;
        Rover rover = new Rover(Direction.SOUTH, new Position(0,0));

        ArrayList<Position> accessibleFiled = new ArrayList<>();
        accessibleFiled.add(new Position(3,0));
        accessibleFiled.add(new Position(1,3));
        accessibleFiled.add(new Position(4,3));
        accessibleFiled.add(new Position(1,5));

        Landscape landscape = new Landscape(6, accessibleFiled);

        Rover result = forward.perform(rover, landscape);
        Rover expected = new Rover(Direction.SOUTH, new Position(1,0));
        assertEquals(expected, result, "Rover should be equal");
    }

    @Test
    void performBackwardToAccessibleField() {
        Action back = Action.BACKWARD;
        Rover rover = new Rover(Direction.WEST, new Position(0,0));

        ArrayList<Position> accessibleFiled = new ArrayList<>();
        accessibleFiled.add(new Position(3,0));
        accessibleFiled.add(new Position(1,3));
        accessibleFiled.add(new Position(4,3));
        accessibleFiled.add(new Position(1,5));

        Landscape landscape = new Landscape(6, accessibleFiled);

        Rover result = back.perform(rover, landscape);
        Rover expected = new Rover(Direction.EAST, new Position(0,1));
        assertEquals(expected, result, "Rover should be east");
    }
}