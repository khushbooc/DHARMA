package model.direction;

/**
 * Created by agemery on 4/18/15.
 */
public enum HexagonalDirection {

    NORTH(0, -1), NORTHEAST(1, -1),
    SOUTHEAST(1, 1), SOUTH(0, 1),
    SOUTHWEST(-1, 0), NORTHWEST(-1,-1);

    private final int dx;
    private final int dy;

    HexagonalDirection(int dx, int dy) {
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
