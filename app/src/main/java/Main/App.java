package Main;

import ControlGame.TerminalGame;
import Tris.Area;

public class App {
    public static void main(String[] args) {
        Area game = new Area();
        TerminalGame terminal = new TerminalGame(game);
        terminal.game();
    }
}
