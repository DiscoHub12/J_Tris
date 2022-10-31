package Tris;

public interface Plane {

    /**
     * Get method that returns the base
     * of the matrix (game area).
     *
     * @return the base of the Game Area.
     */
    int getBase();

    /**
     * Get method that returns the height
     * of the matrix (game area).
     *
     * @return the height of the Game Area.
     */
    int getHeight();

    /**
     * Method that returns the matrix rapresenting
     * the Game Area of Tic-Tac-Toe game.
     *
     * @return the matrix rapresent the game area.
     */
    String[][] symbolsInside();

    int getCount();

    /**
     * Method that checks whether a given Position
     * (Coordinate passed between parameters) can
     * therefore be inside the Plane or not.
     *
     * @param tmp the Position to check if is inside or not.
     * @return true if the Position is inside, false otherwise.
     * @throws NullPointerException if Position tmp is null.
     */
    boolean isCoordinateInside(Position tmp);

    /**
     * Method that checks whether a symbol is already
     * present in a certain position or not.
     *
     * @param c the Position.
     * @return true if there already present Symbol , false otherwise.
     * @throws NullPointerException if the Position c is null.
     */
    boolean isAlreadyPresentSymbol(Position c);


    /**
     * Method that allows you to place a certain
     * symbol inside the game area (therefore in the matrix),
     * passing a symbol and a position as parameters.
     *
     * @param s the Symbol to place into the game Area.
     * @param c the Position for this Symbol.
     * @throws IllegalArgumentException if the Position is not inside the plane/
     *                                  in this position there's already Symbol/the game is finish.
     */
    void placeSymbols(Symbol s, Position c);

    /**
     * Fodamnetale method for the Tic-tac-toe game,
     * as it checks whether the same symbols are present
     * in a straight horizontal or vertical line within the
     * matrix.
     *
     * @return true if there are equals Symbols in a Straight horizontal
     * or vertical.
     */
    boolean isPresentStraightSymbolsV_O();

    /**
     * Method same as above method but check if there
     * are same symbols inside the matrix diagonally.
     *
     * @return true if there are equals Symbols in a straight in diagonal.
     */
    boolean isPresentStraightD();
}
