package ControlGame;

import Tris.Area;
import Tris.Player;
import Tris.Symbol;

import java.util.Scanner;

/**
 * Simple class that has the task of containing
 * methods for creating the Player during the Tic-Tac-Toe game.
 * This part of the program, is a purely useful part for the Terminal Game.
 *
 */
public class CreatePlayer {

    /**
     * Scanner for the input by terminal.
     */
    private final Scanner sc = new Scanner(System.in);

    /**
     * Method that, through user choices from the
     * terminal, creates a Player. This method will be invoked
     * in the TerminalGame class.
     * @param area the Area for the game.
     * @return the new Player created.
     */
    public Player createPlayer(Area area){
        System.out.println("Insert name for the Player:");
        String name = sc.nextLine();
        Symbol symbol = simbol();
        return new Player(area, name, symbol);
    }

    /**
     * Method that reduce code, useful for asking for
     * the Symbol that a user wants to use for the game,
     * whether it is 'X' or 'O'
     * @return the Symbol created.
     */
    public Symbol simbol(){
        System.out.println("Insert your simbol ('X' or 'O'):");
        String str = sc.nextLine();
        return new Symbol(str);
    }
}
