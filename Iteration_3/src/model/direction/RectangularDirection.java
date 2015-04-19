package model.direction;

/**
 * Created by agemery on 4/18/15.
 */

//Direction enum for rectangular direction, based on cartesian coordinate system
public enum RectangularDirection {

    WEST(-1, 0), NORTHWEST(-1, 1),
    NORTH(0, 1), NORTHEAST(1, 1),
    EAST(1, 0), SOUTHEAST(1, -1),
    SOUTH(0, -1), SOUTHWEST(-1, -1);

    private final int dx;
    private final int dy;

    RectangularDirection(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
