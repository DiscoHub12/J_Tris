package Tris;

import java.util.Objects;

/**
 * This class provides a default implementation of the
 * Plane interface. Rapresents the concept of the Playing area
 * of the Tic-Tac-Toe game. So a 3x3 matrix that can contain
 * Symbols (chosen and placed of Players game). It also provides
 * methods of winning control, i.e if there are 3 identical Symbols
 * in a Straight vertical, horizontal or diagonal line, the player
 * win.
 */
public class Area implements Plane {

    /**
     * Attributre that rapresents the base
     * of the game area.
     */
    private final int base;

    /**
     * Attribute that rapresents the height
     * of the game area.
     */
    private final int height;

    /**
     * Attribute that rapresents the matrix of
     * the Playing Area, where player's Symbols
     * will be placed.
     */
    private final String[][] symbolsInside;

    /**
     * Attribute that rapresent counter to check
     * if the positions of the Matrix are still free.
     */
    private int count;

    private boolean hasWin;


    /**
     * Constructor that creates a play area,
     * through which the default attributes will
     * be instantiated.
     */
    public Area() {
        this.base = 3;
        this.height = 3;
        this.symbolsInside = new String[this.base][this.height];
        addDefaultSymbol();
        this.count = 0;
        this.hasWin = false;
    }


    @Override
    public int getBase() {
        return this.base;
    }


    @Override
    public int getHeight() {
        return this.height;
    }


    @Override
    public String[][] symbolsInside() {
        return this.symbolsInside;
    }


    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public boolean isHasWin() {
        return this.hasWin;
    }

    @Override
    public void addDefaultSymbol() {
        for (int i = 0; i < this.getBase(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                this.symbolsInside[i][j] = "-";
            }
        }
    }

    @Override
    public boolean isCoordinateInside(Position tmp) {
        Objects.requireNonNull(tmp);
        return tmp.getXPoint() <= this.base && tmp.getYPoint() <= this.height;
    }

    @Override
    public boolean isAlreadyPresentSymbol(Position c) {
        Objects.requireNonNull(c);
        int x = c.getXPoint();
        int y = c.getYPoint();
        String symbol = this.symbolsInside[x][y];
        return Objects.equals(symbol, "X") || Objects.equals(symbol, "O");
    }

    @Override
    public void placeSymbols(Symbol s, Position c) {
        Objects.requireNonNull(s);
        Objects.requireNonNull(c);
        if (count >= 9 && !isPresentWinner())
            throw new IllegalArgumentException("The Game is finish. There isn't winner player.");
        if (!isCoordinateInside(c))
            throw new IllegalArgumentException("Illegal position for this Symbol");
        if (isAlreadyPresentSymbol(c))
            throw new IllegalArgumentException("In this position, there's already Symbol.");
        this.symbolsInside[c.getXPoint()][c.getYPoint()] = s.getSymbol();
        s.setPosition(c);
        this.count++;
        if (isPresentWinner()) {
            this.hasWin = true;
            System.out.println("Player with Symbol: " + s.getSymbol() + "is the Winner.");
            ;
        }
    }

    @Override
    public boolean isPresentWinner() {
        return isEqualsRow() || isEqualsColumn() || isPresentStraightD();
    }

    @Override
    public boolean isPresentStraightD() {
        String tmp = "";
        tmp = this.symbolsInside[0][0];
        if (tmp != null) {
            if (tmp.equals(this.symbolsInside[1][1]) && tmp.equals(this.symbolsInside[2][2])) {
                return true;
            } else return false;
        } else {
            tmp = this.symbolsInside[0][2];
            if (tmp != null) {
                if (tmp.equals(this.symbolsInside[1][1]) && tmp.equals(this.symbolsInside[2][0])) {
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public boolean isEqualsRow() {
        String tmp = "";
        for (int j = 0; j < this.getHeight(); j++) {
            tmp = this.symbolsInside[0][j];
            if (Objects.equals(tmp, "Null")) {

            } else return Objects.equals(tmp, this.symbolsInside[1][j]) &&
                    Objects.equals(tmp, this.symbolsInside[2][j]);
        }
        return false;
    }

    public boolean isEqualsColumn() {
        String tmp = "";
        for (int i = 0; i < this.getBase(); i++) {
            tmp = this.symbolsInside[i][0];
            if (Objects.equals(tmp, "Null")) {

            } else return Objects.equals(tmp, this.symbolsInside[i][1]) &&
                    Objects.equals(tmp, this.symbolsInside[i][2]);
        }
        return false;
    }
}
