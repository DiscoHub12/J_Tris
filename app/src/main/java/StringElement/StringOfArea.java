package StringElement;

import Tris.Area;

import java.util.Objects;

/**
 * Simple class that has the task of printing
 * the matrix of the Area we are considering.
 */
public class StringOfArea {

    /**
     * Attribute that indicates the Area we are
     * considering and which, therefore, we must
     * print.
     */
    private final Area gameArea;

    /**
     * Constructor, it will be useful to build
     * this particular Object in the game itself,
     * as during the game, the Game Area will be
     * printed several times.
     * @param area the Area.
     */
    public StringOfArea(Area area){
        Objects.requireNonNull(area);
        this.gameArea = area;
    }

    /**
     * Method that prints the Area of the game.
     * (Matrix)
     */
    public void printArea(){
        for(int i=0; i < this.gameArea.getBase(); i++){
            for(int j=0; j < this.gameArea.getHeight(); j++){
                System.out.printf(this.gameArea.symbolsInside()[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
