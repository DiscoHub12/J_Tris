package ControlGame;

import StringElement.StringOfArea;
import Tris.Area;
import Tris.Player;
import Tris.Position;

import java.util.Scanner;

public class TerminalGame {

    /**
     * Object of type StringOfArea, allows you to
     * print, at each user action, the game Area we
     * are dealign with.
     */
    private final StringOfArea areaString;

    /**
     * Object of type CreatePlayer, useful in
     * this context to create Players at the beginning
     * of the Game.
     */
    private final CreatePlayer createPlayer;

    /**
     * Attribute representing the first Player.
     */
    private Player playerOne;

    /**
     * Attribute representing the second Player.
     */
    private Player playerTwo;

    /**
     * Attribute that rapresents the Game area.
     */
    private final Area area;

    /**
     * Scanner for user input from the terminal.
     */
    private Scanner sc;

    public TerminalGame(Area area) {
        this.createPlayer = new CreatePlayer();
        this.areaString = new StringOfArea(area);
        this.area = area;
        this.sc = new Scanner(System.in);
    }

    /**
     *
     */
    private void creatingPlayer() {
        System.out.println("\nPLAYER CREATION.");
        this.playerOne = this.createPlayer.createPlayer(this.area);
        this.playerTwo = this.createPlayer.createPlayer(this.area);
        if (this.playerTwo.getMySymbol() == this.playerOne.getMySymbol()) {
            System.out.println("Illegal simbol for this player. It's already choose.\nInsert another simbol:");
            this.createPlayer.simbol();
        }
    }

    /**
     *
     * @param player
     */
    private void hitMethod(Player player) {
        int x;
        int y;
        System.out.println(player.getName() + " it's your turn.\n" +
                "Enter a position (Coordinate) where you want to put your symbol:");
        x = sc.nextInt();
        y = sc.nextInt();
        Position position = new Position(x, y);
        player.hitPosition(position);
        System.out.println("\nGAME AREA:");
        this.areaString.printArea();
    }

    /**
     *
     */
    public void game() {
        System.out.println("TIC-TAC-TOE GAME.");
        creatingPlayer();
        System.out.println("\nGAME AREA:");
        this.areaString.printArea();
        while (!this.area.isHasWin() || this.area.getCount() < 9) {
            hitMethod(playerOne);
            hitMethod(playerTwo);
        }
    }
}
