package Tris;

/**
 * * This class provides a default implementation of
 * * the Coordinate interface.
 * * Its purpose within the Project is to rapresent the concept
 * of Position , that is a Coordinate.
 * It will be useful for managing and keeping track of the
 * Position of tic-tac-toe Symbols within the Playing Area.
 */
public class Position implements Coordinate {

    /**
     * Atribute that rapresents the point X
     * of a given Coordinate.
     */
    private final int xPoint;

    /**
     * Atribute that rapresents the point Y
     * of a given Coordinate.
     */
    private final int yPoint;

    /**
     * Constructor that creates a Coordinate , passing
     * point X and point Y as parameters.
     *
     * @param x the x point of this Coordinate.
     * @param y the y point of this Coordinate.
     * @throws IllegalArgumentException if the x point or the y point are less
     *                                  than 0
     */
    public Position(int x, int y) {
        if (x < 0 || y < 0 || x >= Integer.MAX_VALUE || y >= Integer.MAX_VALUE)
            throw new IllegalArgumentException("Illegal value of x or y position.");
        this.xPoint = x;
        this.yPoint = y;
    }

    @Override
    public int getXPoint() {
        return this.xPoint;
    }

    @Override
    public int getYPoint() {
        return this.yPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Position tmp) {
            return this.getXPoint() == tmp.getXPoint() && this.getYPoint() == tmp.getYPoint();
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nx:" + this.getXPoint() +
                "\ny:" + this.getYPoint();
    }

}