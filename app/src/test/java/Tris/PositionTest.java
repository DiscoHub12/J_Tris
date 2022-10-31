package Tris;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is a Test class, which aims
 * to verify the correct functioning of the
 * methods of the Coordinate class.
 * (although they are default methods such as get
 * and set).
 */
public class PositionTest {

    /**
     * Test the correct values after call
     * get method for x values.
     */
    @Test
    public void testGetXPoint(){
        int x = 5;
        Position tmp = new Position(x, 12);
        assertEquals(x, tmp.getXPoint());
        int x1 = Integer.MAX_VALUE;
        assertThrows(IllegalArgumentException.class, () -> new Position(x1, 10));
    }

    /**
     * Test the correct values after call
     * get method for y values.
     */
    @Test
    public void testGetYPoint(){
        int y = 12;
        Position tmp = new Position(10, y);
        assertEquals(y, tmp.getYPoint());
        int yM = Integer.MAX_VALUE;
        assertThrows(IllegalArgumentException.class, () -> new Position(10, yM));
    }

    /**
     * Test the equals methods.
     */
    @Test
    public void testEquals(){
        Position p1 = new Position(5,5);
        Position p2 = new Position(5,5);
        Position p3 = new Position(2,3);
        assertEquals(p1, p2);
        assertNotEquals(p2,p3);
    }
}
