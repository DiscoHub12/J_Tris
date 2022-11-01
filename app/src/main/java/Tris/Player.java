package Tris;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * This class provides a default implementation of the
 * Gamer interface.
 * It is rapresent the concept of player for the Tic-Tac-Toe
 * game. So a player,m in addition to having name, has his own
 * Symbol that he will choose at the beginning of the game,
 * and the only action a player can perform is to place his
 * Symbol inside the game Area.
 */
public class Player implements Gamer {

    /**
     * This attribute rapresents the Player's name.
     */
    private final String name;

    /**
     * This attribute rapresents a list (Set)
     * that keeps track of the positions where
     * this player has placed his Symbols.
     */
    private final Set<Position> hitted;

    /**
     * This attributes rapresent the Symbol
     * chosen by the Playerm, which can be "X" or
     * "O".
     */
    private final Symbol mySymbol;

    /**
     * This attribute rapresent the game Area.
     */
    private final Area area;

    /**
     * Constructor that allows you to create a Player
     * for the Tic-Tac-Toe games.
     *
     * @param area   the game Area.
     * @param name   the name for this Player.
     * @param simbol the Symbol for this Player.
     */
    public Player(Area area, String name, Symbol simbol) {
        this.name = name;
        this.mySymbol = simbol;
        this.area = area;
        this.hitted = new HashSet<>();
    }

    @Override
    public void hitPosition(Position tmp) {
        Objects.requireNonNull(tmp);
        if (!this.area.isCoordinateInside(tmp))
            throw new IllegalArgumentException("Illegal position for place the Symbol.");
        if (this.hitted.contains(tmp))
            throw new IllegalArgumentException("Illegal action, position already hitted.");
        this.hitted.add(tmp);
        this.area.placeSymbols(mySymbol, tmp);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Symbol getMySymbol() {
        return this.mySymbol;
    }

    @Override
    public Set<Position> getHitted() {
        return this.hitted;
    }
}
