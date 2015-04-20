package model.direction;

/**
 * Created by agemery on 4/18/15.
 */

//Direction enum for rectangular direction, based on cartesian coordinate system
public enum RectangularDirection {

    WEST(-1, 0, "LEFT"), NORTH(0, 1, "UP"),
    EAST(1, 0, "RIGHT"), SOUTH(0, -1, "DOWN");

    /*
    NORTHWEST(-1, 1), NORTHEAST(1, 1),
    SOUTHEAST(1, -1), SOUTHWEST(-1, -1);*/

    private final int dx;
    private final int dy;
    private final String relative_equivalent;

    RectangularDirection(int dx, int dy, String relative_equivalent) {
        this.dx = dx;
        this.dy = dy;
        this.relative_equivalent = relative_equivalent;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public String getRelativeDirectionEquivalent() {
        return relative_equivalent;
    }
}
