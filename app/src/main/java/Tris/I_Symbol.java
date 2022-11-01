package Tris;

/**
 * Interface that rapresents a contract fot those who
 * use this service, which rapresents a Symbol fot the Tic-Tac-Toe game,
 * that is, a Cross or a Circle. It provides ceratin methods to be
 * implemented by the Symbol class.
 */
public interface I_Symbol {

    /**
     * Get method that returns the type of the
     * Symbol, then the String it rapresents if the
     * Symbol is Cross or Circle.
     *
     * @return the String that rapresent the type of the Symbol.
     */
    String getSymbol();

    /**
     * Get method that returns Position (Coordinate) fo
     * the Symbol within the Play Area.
     *
     * @return the Coordinate.
     */
    Coordinate getPosition();

    /**
     * Set method to set a determine Coordinate in
     * the Game Area for a Symbol.
     *
     * @param c the Coordinate to set for this Symbol.
     * @throws NullPointerException if the Coordinate c is null.
     */
    void setPosition(Coordinate c);

}
