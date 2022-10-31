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
        //Todo implementare
    }

    /**
     * Test method that verifies the correct functioning
     * of the method to add a certain Symbol inside the Playing
     * Area, then also performs numerous tests.
     */
    @Test
    public void testPlaceSymbols(){
        //Todo implementare
    }

    /**
     * Test method that verifies the correct functioning of the
     * method toi check if same symbols are present in a Straight line, true
     * or horizontal, so as to return true if a particular player has won,
     * falsde otherwise.
     */
    @Test
    public void testPresentStraightV_O(){
        //Todo implementare
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

}
