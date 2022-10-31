package Tris;

/**
 * This interface is implemented by the Position class,
 * which will in turn implement all these methods by the
 * interface. Its purpose is to rapresent the concept of
 * Coordinate, therefore a pair of x and y values that
 * rapresent a certain Point within a Plane/Area.
 */
public interface Coordinate {

    /**
     * Get method to return the point
     * x of a Position (Coordinate).
     *
     * @return the x point.
     */
    int getXPoint();


    /**
     * Get method to return the point
     * y of a Position (Coordinate).
     *
     * @return the y point.
     */
    int getYPoint();


    /**
     * Equals method to check if two
     * Positions (Coordinates) are equals.
     *
     * @param obj the Object to check.
     * @return true if the two Objects are equals.
     * false otherwise.
     */
    boolean equals(Object obj);

    /**
     * Method toString.
     *
     * @return a String rapresenting the
     * concept of a Position (Coordinate) in the
     * form of a String.
     */
    String toString();
}
