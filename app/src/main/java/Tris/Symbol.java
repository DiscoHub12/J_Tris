package Tris;

import java.util.Objects;

public class Symbol implements I_Symbol {

    /**
     * This attribute rapresents the Symbol
     * we are dealing with in the form of a String,
     * so it identifies whether it is a Cross or a
     * Circle.
     */
    private final String symbol;

    /**
     * This attribute indicates the specific Position
     * (Coordinate) of this Symbol (therefore in
     * which Position of the Plane it is located).
     */
     private Coordinate position;

    /**
     * Constructor that allows you to create a
     * Symbol, through the parameters that are passed
     * or a Sring that must be the word "Circle" or
     * "Cross" and certain position (Coordinate).
     *
     * @param s the string indicating the type of Symbol, which
     *          must be either "Cross" or "Circle".
     *
     * @throws IllegalArgumentException if the string is not the word
     *                                  "Cross" or "Circle"
     */
    public Symbol(String s) {
        Objects.requireNonNull(s);
        if (s.equals("Circle") || s.equals("Cross")) {
            this.symbol = s;
        } else throw new IllegalArgumentException("This Symbol not exists.");
    }


    @Override
    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public Coordinate getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(Coordinate c) {
        Objects.requireNonNull(c);
        this.position = c;
    }
}
