package Tris;

import java.util.Set;

/**
 * Interface that provides a series of methods that
 * will be implemented by the Player class. (rapresenting
 * a Player for the Tic-Tac-Toe game)
 */
public interface Gamer {

    /**
     * Method that allows the Player to palce
     * his Symbol in a certain position within
     * the Game Area.
     *
     * @param tmp the position to place the Symbol.
     * @throws NullPointerException     if the Position tmp is null.
     * @throws IllegalArgumentException if the position is illegal for the Area parameters
     *                                  or the position is already chosen.
     */
    void hitPosition(Position tmp);

    /**
     * Method that return the Player name.
     *
     * @return the name of the Player.
     */
    String getName();

    /**
     * Method that return the specific
     * Symbol of player.
     *
     * @return the Symbol of Player.
     */
    Symbol getMySymbol();

    /**
     * Method that return a list (Set) of the
     * Positions where a particular Player has
     * palced his Symbols.
     *
     * @return the list (Set) of the positions.
     */
    Set<Position> getHitted();
}
