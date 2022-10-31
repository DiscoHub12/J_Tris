package Tris;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class that aims to verify the correct execution
 * and operation of methods present in the Area class.
 */
public class AreaTest {

    /**
     * Test method that verifies the correct
     * result of the get method to return the base of
     * the Area.
     */
    @Test
    public void testGetBase(){
        Area a = new Area();
        assertEquals(3, a.getBase());
        Area b = new Area();
        assertEquals(3, b.getBase());
    }

    /**
     * test method that verifies the correct
     * result of the get method to return the height
     * of the Area.
     */
    @Test
    public void testGetHeight(){
        Area a = new Area();
        assertEquals(3, a.getHeight());
        Area b = new Area();
        assertEquals(3, b.getHeight());
    }

    /**
     * Test method that verifies the correct functioning
     * of the Coordinate inside method, that is , it
     * checks that some Coordinate dates are inside the
     * Area or not.
     */
    @Test
    public void testCoordinateInside(){
        Area a = new Area();
        Position p = new Position(0,0);
        assertTrue(a.isCoordinateInside(p));
        Position p1 = new Position(0,1);
        assertTrue(a.isCoordinateInside(p1));
        Position p2 = new Position(1,1);
        assertTrue(a.isCoordinateInside(p2));
        Position p3 = new Position(2,3);
        assertTrue(a.isCoordinateInside(p3));
        Position p4 = new Position(3,2);
        assertTrue(a.isCoordinateInside(p4));
        Position p5 = new Position(2,2);
        assertTrue(a.isCoordinateInside(p5));
        Position p6 = new Position(2,4);
        assertFalse(a.isCoordinateInside(p6));
        Position p7 = new Position(2,5);
        assertFalse(a.isCoordinateInside(p7));
        Position p8 = new Position(5,4);
        assertFalse(a.isCoordinateInside(p8));
        Position p9 = new Position(6,6);
        assertFalse(a.isCoordinateInside(p9));
    }

    /**
     * Test method that verifies the correct functioning
     * of the isAlreadyPresentSymbols method, that is, it
     * checks if there is already a Symbol in a certain
     * Position of the Area.
     */
    @Test
    public void testIsAlreadyPresentSymbols(){
        Symbol s = new Symbol("Circle");
        Symbol s1 = new Symbol("Circle");
        Symbol s2 = new Symbol("Cross");
        Symbol s3 = new Symbol("Cross");
        Area a = new Area();
        a.placeSymbols(s, new Position(0,0));
        a.placeSymbols(s1, new Position(1,1));
        a.placeSymbols(s2, new Position(2,2));
        a.placeSymbols(s3, new Position(1,0));
        assertTrue(a.isAlreadyPresentSymbol(new Position(0,0)));
        assertTrue(a.isAlreadyPresentSymbol(new Position(1,1)));
        assertTrue(a.isAlreadyPresentSymbol(new Position(2,2)));
        assertTrue(a.isAlreadyPresentSymbol(new Position(1,0)));
        assertFalse(a.isAlreadyPresentSymbol(new Position(2,0)));
    }

    /**
     * Test method that verifies the correct functioning
     * of the method to add a certain Symbol inside the Playing
     * Area, then also performs numerous tests.
     */
    @Test
    public void testPlaceSymbols(){
        Area a = new Area();
        Symbol s = new Symbol("Circle");
        Symbol s1 = new Symbol("Circle");
        Symbol s2 = new Symbol("Cross");
        Symbol s3 = new Symbol("Cross");
        assertThrows(NullPointerException.class, () -> a.placeSymbols(null, new Position(2,2)));
        assertThrows(NullPointerException.class, () -> a.placeSymbols(s, null));
        assertThrows(IllegalArgumentException.class, () -> a.placeSymbols(s, new Position(4,4)));
        a.placeSymbols(s, new Position(0,0));
        assertEquals(1, a.getCount());
        assertThrows(IllegalArgumentException.class, () -> a.placeSymbols(s, new Position(0,0)));
        a.placeSymbols(s, new Position(0,1));
        assertEquals(2,a.getCount());
        assertThrows(IllegalArgumentException.class, () -> a.placeSymbols(s, new Position(0,1)));

    }

    /**
     * Test method that verifies the correct functioning of the
     * method toi check if same symbols are present in a Straight line, true
     * or horizontal, so as to return true if a particular player has won,
     * falsde otherwise.
     */
    @Test
    public void testPresentStraightV_O(){
        Area a = new Area();
        Symbol s = new Symbol("Circle");
        Symbol s1 = new Symbol("Circle");
        Symbol s2 = new Symbol("Circle");
        a.placeSymbols(s, new Position(0,0));
        a.placeSymbols(s1, new Position(1,0));
        a.placeSymbols(s2, new Position(2, 0));
        assertTrue(a.isPresentStraightSymbolsV_O());
    }

    /**
     * Test method that verifies correct operation like the above
     * method, but checks if there is a straight line of the same
     * Symbols in a horizontal line.
     */
    @Test
    public void testIsPresentStraightD(){
        //Todo implementare
    }

    @Test
    public void testIsEqualsRow(){
        Area a = new Area();
        Symbol s = new Symbol("Circle");
        Symbol s1 = new Symbol("Circle");
        Symbol s2 = new Symbol("Circle");
        a.placeSymbols(s, new Position(0,0));
        a.placeSymbols(s1, new Position(0,1));
        a.placeSymbols(s2, new Position(0, 2));
        assertTrue(a.isEqualsRow());
    }

    @Test
    public void testIsEqualsColumn(){
        Area a = new Area();
        Symbol s = new Symbol("Circle");
        Symbol s1 = new Symbol("Circle");
        Symbol s2 = new Symbol("Circle");
        a.placeSymbols(s, new Position(0,0));
        a.placeSymbols(s1, new Position(1,0));
        a.placeSymbols(s2, new Position(2, 0));
        assertTrue(a.isEqualsColumn());
    }

}
