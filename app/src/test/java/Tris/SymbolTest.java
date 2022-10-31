package Tris;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class that aims to verify the correct execution and
 * operation of methods present in the Symbol class.
 */
public class SymbolTest {

    /**
     * This test method verifies the correct raising
     * of a given exception if the parameters are not
     * accepted correctly.
     */
    @Test
    public void testNullParameters() {
        assertThrows(NullPointerException.class, () -> new Symbol(null));
        assertThrows(IllegalArgumentException.class, () -> new Symbol("Cerchio"));
        assertThrows(IllegalArgumentException.class, () -> new Symbol("Croce"));
        assertThrows(IllegalArgumentException.class, () -> new Symbol("Test"));
        Symbol s = new Symbol("Circle");
    }

    /**
     * This test method verifies the correct functioning of
     * the get method for the return of the String of a
     * given Symbol.
     */
    @Test
    public void testGetSymbol() {
        Symbol s = new Symbol("Circle");
        assertEquals("Circle", s.getSymbol());
        Symbol s1 = new Symbol("Cross");
        assertEquals("Cross", s1.getSymbol());
        Symbol s2 = new Symbol("Circle");
        assertEquals("Circle", s2.getSymbol());
    }
}
